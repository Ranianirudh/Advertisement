package com.acro.adv.repository;

import com.acro.adv.config.DBConnection;
import com.acro.adv.model.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressRepositoryImpl implements AddressRepository{
    DBConnection dbConnection=new DBConnection();
    public Address createAddress(Address address){
        Connection connection = dbConnection.getConnection();
        try{ //Long addressId, String streetName, String city, String primaryAddress, String secondaryAddress, Long companyId
            String MysqlInsert="Insert Into advrtisement.address(address_id,primary_address,secondary_address,company_id)" +
                    " Values (?,?,?,?) ";
            PreparedStatement pst=connection.prepareStatement(MysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,address.getPrimaryAddress());
            pst.setString(2, address.getSecondaryAddress());
            pst.setLong(3,address.getCompanyId());
            int result=pst.executeUpdate();
            System.out.println("Address created");
            ResultSet resultset= pst.getGeneratedKeys();
            while(resultset.next()){
                Long id = resultset.getLong(1);
                address.setCompanyId(id);
                return address;
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
