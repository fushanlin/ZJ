package com.another.company.controller;

import com.another.base.entity.Json;
import com.another.company.entity.Company;
import com.another.company.service.CompanyService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 30590 on 2017-02-23 0023.
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    private Logger logger = Logger.getLogger(this.getClass());
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Json addCompany(@RequestBody Company company) {
        Json json = new Json();

            Company newcompany=companyService.addcompany(company);
            json.setCode(ResultCode.SUCCESS_CODE).setData(newcompany);


        return json;

    }
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Json updateCompany(@RequestBody Company company) {
        Json json = new Json();
            Company newcompany=companyService.updatecompany(company);
            json.setCode(ResultCode.SUCCESS_CODE).setData(newcompany);



        return json;
    }
}
