package com.acro.adv.repository;

import com.acro.adv.config.DBConnection;
import com.acro.adv.model.Advertisement;
import com.acro.adv.model.Content;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AdvRepositoryImpl implements AdvRepository {
    DBConnection dbConnection = new DBConnection();

    public Advertisement createAdvertisement(Advertisement advertisement) {
        Connection connection = dbConnection.getConnection();
        try {
            // Long advId, String advName, Long companyId, Long contentId, LocalDate publishedDate

            String mysqlInsert = "INSERT INTO advrtisement.advertisement(adv_name,company_id,published_date) " +
                    "values(?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, advertisement.getAdvName());
            pst.setLong(2, advertisement.getCompanyId());
            pst.setDate(3, Date.valueOf(advertisement.getPublishedDate()));

//         pst.setDate(5,Date.valueOf(advertisement.getEndDate()));
            int result = pst.executeUpdate();
            System.out.println("advertisement created");
            ResultSet resultSet = pst.getGeneratedKeys();
            if (resultSet.next()) {
                Long id = resultSet.getLong(1);
                advertisement.setAdvId(id);
                return advertisement;
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            dbConnection.closeConnection(connection);
        }

        return null;
    }

    @Override
    public Advertisement getAdvertisementByName(String advName, long companyId) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlSelect = "select * from advertisement where adv_name=? AND company_id=?";
            PreparedStatement pst = connection.prepareStatement(mysqlSelect);
            pst.setString(1, advName);
            pst.setLong(2, companyId);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                Advertisement advertisement = new Advertisement();
                advertisement.setAdvId(resultSet.getLong("adv_id"));
                advertisement.setAdvName(resultSet.getString("Adv_name"));
                Date publisheddDate = resultSet.getDate("published_date");
                advertisement.setPublishedDate(publisheddDate.toLocalDate());
                advertisement.setCompanyId(resultSet.getLong("company_id"));
                return advertisement;

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public Advertisement getAdvertisementById(Long advId, Long companyId) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlSelect = "select * from advertisement where adv_id=? ;";
            if(companyId!=null && companyId>0) {
                mysqlSelect = mysqlSelect + " And company_id=?";
            }
            PreparedStatement pst = connection.prepareStatement(mysqlSelect);
            pst.setLong(1, advId);
            if(companyId!=null && companyId>0) {
                pst.setLong(2, companyId);
            }
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                Advertisement advertisement = new Advertisement();
                advertisement.setAdvId(resultSet.getLong("adv_id"));
                advertisement.setAdvName(resultSet.getString("adv_name"));
                Date publisheddDate = resultSet.getDate("published_date");
                advertisement.setPublishedDate(publisheddDate.toLocalDate());
                advertisement.setCompanyId(resultSet.getLong("company_id"));
                return advertisement;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }

        return null;
    }

    public List<Content> getContentByAdvertisementId(Long avdId, Long companyId) {
        Connection connection = dbConnection.getConnection();
        List<Content> contents=new ArrayList<>();
        try {
            String mysqlSelect = "select * from content where adv_id=? ";
            if(companyId!=null && companyId>0){
                mysqlSelect= mysqlSelect+ " And company_id=?";
            }
            PreparedStatement pst = connection.prepareStatement(mysqlSelect);
            pst.setLong(1, avdId);
            if(companyId!=null && companyId>0) {
                pst.setLong(2, companyId);
            }
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                Content content=new Content();
                content.setContentId(resultSet.getLong("content_id"));
                content.setContentName(resultSet.getString("content_name"));
                content.setContentFile (resultSet.getString("content_file"));
                Date createdDate =(resultSet.getDate("created_date"));
                content.setCreatedDate(createdDate.toLocalDate());
                content.setContentType(resultSet.getString("content_type"));
                content.setContentDuration(resultSet.getDouble("content_duration"));
                content.setInternal(resultSet.getBoolean("isinternal"));
                content.setCompanyId(resultSet.getLong("company_id"));
                content.setStaffId( resultSet.getLong("staff_id"));
                content.setAdvId(resultSet.getLong("adv_id"));
                contents.add(content);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }

        return contents;
    }
    public List<Advertisement> getAdvertisementByCompanyId(Long companyId){
        Connection connection = dbConnection.getConnection();
        List<Advertisement> advertisements=new ArrayList<>();
        try {
                String mysqlSelect = "select * from advertisement where company_id=? ;";
            PreparedStatement pst = connection.prepareStatement(mysqlSelect);
            pst.setLong(1, companyId);

            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                Advertisement advertisement = new Advertisement();
                advertisement.setAdvId(resultSet.getLong("adv_id"));
                advertisement.setAdvName(resultSet.getString("adv_name"));
                Date publisheddDate = resultSet.getDate("published_date");
                advertisement.setPublishedDate(publisheddDate.toLocalDate());
                advertisement.setCompanyId(resultSet.getLong("company_id"));
                advertisements.add(advertisement);
            }
                return advertisements;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }

    }
}