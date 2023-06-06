package com.acro.adv.controller;

import com.acro.adv.model.Company;
import com.acro.adv.service.CompanyService;
import com.acro.adv.service.CompanyServiceImpl;

public class CompanyController {
    CompanyService companyService= new CompanyServiceImpl();
    Company saveCompany(Company company) {
        return companyService.saveCompany(company);

    }
}
