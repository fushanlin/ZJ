package com.another.company.service.impl;

import com.another.company.dao.CompanyDao;
import com.another.company.entity.Company;
import com.another.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 30590 on 2017-02-23 0023.
 */

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;

    public Company addcompany(Company company) {
        companyDao.addcompany(company);
        return company;
    }

    public Company updatecompany(Company company) {
        companyDao.updatecompany(company);
        return company;
    }

}
