package com.acro.adv.service;

import com.acro.adv.model.Company;
import com.acro.adv.repository.CompanyRepository;
import com.acro.adv.repository.CompanyRepositoryImpl;

public class CompanyServiceImpl implements CompanyService{
    CompanyRepository companyRepository=new CompanyRepositoryImpl();
    public Company saveCompany(Company company){
        if(company.getCompanyId()!=null && company.getCompanyCode()!=null && company.getCompanyCode()!=null){
            return companyRepository.createCompany(company);
        }
        return null;
    }

}
