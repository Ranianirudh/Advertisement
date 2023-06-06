package com.acro.adv.repository;

import com.acro.adv.config.DBConnection;
import com.acro.adv.model.Company;

import java.sql.*;

public class CompanyRepositoryImpl implements CompanyRepository{
    DBConnection dbConnection=new DBConnection();
    public Company createCompany(Company company) {
        Connection connection = dbConnection.getConnection();
        try {
            //Long companyId, String companyName, String companyCode, int establishedYear, boolean isActive, Long addressId
            String mysqlInsert = "INSERT INTO advrtisement.company(company_Name,company_Code,established_Year,isActive,address_id) " +
                    "values (?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, company.getCompanyName());
            pst.setString(2, company.getCompanyCode());
            pst.setInt(3, company.getEstablishedYear());
            int result = pst.executeUpdate();
            System.out.println("company created");
            ResultSet resultSet = pst.getGeneratedKeys();
            while (resultSet.next()) {
                Long id = resultSet.getLong(1);
                company.setCompanyId(id);
                return company;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbConnection.closeConnection(connection);
        }
    }


}
