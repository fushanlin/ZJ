package com.another.department.controller;
import com.another.base.entity.Json;
import com.another.department.entity.Department;
import com.another.department.service.DepartmentService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Created by 30590 on 2017-02-25 0025.
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;
    private Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Json regdepartment(@RequestBody Department department) {
        Json json = new Json();

        Department newdepartment = departmentService.regdepartment(department);//调用业务层的函数
        json.setCode(ResultCode.SUCCESS_CODE).setData(department);
        return json;


    }
}