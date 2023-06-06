package com.acro.adv.repository;

import com.acro.adv.config.DBConnection;
import com.acro.adv.model.Platform;

import java.sql.Connection;

public class PlatformRepositoryImpl  {
//     DBConnection dbConnection = new DBConnection();

    /*public Platform createPlatform(Platform platform) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlInsert = "INSERT INTO advrtisement.platform (content_name, content_file, created_date," +
                    " content_type, content_duration, isinternalorexternal, company_id, staff_id) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, content.getContentName());
            InputStream targetStream = new ByteArrayInputStream(content.getContentFile());
            pst.setBlob(2, targetStream, content.getContentFile().length);
            pst.setDate(3, Date.valueOf(content.getCreatedDate()));
            pst.setString(4, content.getContentType());
            pst.setTime(5, Time.valueOf(content.getContentDuration()));
            pst.setBoolean(6, content.isInternalOrExternal());
            pst.setLong(7, content.getCompanyId());
            pst.setLong(8, content.getStaffId());
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
    }*/

}
