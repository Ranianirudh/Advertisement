package com.acro.adv.service;

import com.acro.adv.model.Address;
import com.acro.adv.model.Company;
import com.acro.adv.repository.AddressRepository;
import com.acro.adv.repository.AddressRepositoryImpl;
import com.acro.adv.repository.CompanyRepository;
import com.acro.adv.repository.CompanyRepositoryImpl;

public class AddressServiceImpl implements AddressService{
    AddressRepository addressRepository=new AddressRepositoryImpl();
    public Address saveAddress(Address address){
        if(address.getAddressId()!=null && address.getPrimaryAddress()!=null && address.getSecondaryAddress()!=null
                &&address.getCompanyId()!=null){
            return addressRepository.createAddress(address);
        }
        return null;
    }

}
