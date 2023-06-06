package com.acro.adv.repository;

import com.acro.adv.config.DBConnection;
import com.acro.adv.model.Content;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class ContentRepositoryImpl implements ContentRepository {
    DBConnection dbConnection = new DBConnection();

    public Content createContent(Content content) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlInsert = "INSERT INTO advrtisement.content (content_name, content_file, created_date," +
                    " content_type, content_duration, isinternal, company_id, staff_id,adv_id) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, content.getContentName());
            pst.setString(2, content.getContentFile());
            pst.setDate(3, Date.valueOf(content.getCreatedDate()));
            pst.setString(4, content.getContentType());
            pst.setDouble(5, content.getContentDuration());
            pst.setBoolean(6, content.isInternal());
            pst.setLong(7, content.getCompanyId());
            pst.setLong(8, content.getStaffId());
            pst.setLong(9,content.getAdvId());
            int result = pst.executeUpdate();
            System.out.println("content created");
            ResultSet resultSet = pst.getGeneratedKeys();

            if(resultSet.next()) {
                long id = resultSet.getLong(1);
                content.setContentId(id);

                return content;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }
    }

    public Content getContentByName(Content content) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlSelect = "select * from content where content_name=? AND company_id=?";
            PreparedStatement pst = connection.prepareStatement(mysqlSelect);
            pst.setString(1, content.getContentName());
            pst.setLong(2,content.getCompanyId());
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                Long id=resultSet.getLong("content_id");
                String contentName=resultSet.getString("content_name");
                String contentFile=resultSet.getString("content_file");
                Date createdDate=resultSet.getDate("created_date");
                LocalDate createdDateLocalDate = createdDate.toLocalDate();
                String contentType=resultSet.getString("content_type");
                double contentDuration=resultSet.getDouble("content_duration");
                boolean isInternalOrExternal=resultSet.getBoolean("isinternal");
                Long companyId= resultSet.getLong("company_id");
                Long staffId=resultSet.getLong("staff_id");
                return new Content(id,contentName,contentFile,
                        createdDateLocalDate,contentType,contentDuration,companyId,staffId,isInternalOrExternal);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            dbConnection.closeConnection(connection);
        }

        return null;
    }

    @Override
    public List<Content> getContentByAdvertisementId(Long advId, Long companyId) {
        return null;
    }
}







