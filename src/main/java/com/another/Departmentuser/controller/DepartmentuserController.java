package com.another.Departmentuser.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Departmentuser.common.DepartmentuserMessage;
import com.another.Departmentuser.entity.Departmentuser;
import com.another.Departmentuser.pageModel.PageDepartmentuser;
import com.another.Departmentuser.service.DepartmentuserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Departmentuser")
public class DepartmentuserController {

    @Autowired
    DepartmentuserService DepartmentuserService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addDepartmentuser", method = RequestMethod.POST)
	@ResponseBody
    public Json addDepartmentuser(@RequestBody PageDepartmentuser pageDepartmentuser){
        Json json = new Json();
        try {
            DepartmentuserService.addDepartmentuser(pageDepartmentuser);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentuserMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteDepartmentuserById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteDepartmentuser(@RequestBody PageDepartmentuser pageDepartmentuser){
        Json json = new Json();
        try {
            DepartmentuserService.deleteDepartmentuserById(pageDepartmentuser);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentuserMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getDepartmentuserList", method = RequestMethod.POST)
	@ResponseBody
    public Json getDepartmentuser(@RequestBody PageDepartmentuser pageDepartmentuser){
        Json json = new Json();
        Page<Departmentuser> page = DepartmentuserService.getDepartmentuserList(pageDepartmentuser);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getDepartmentuserById", method = RequestMethod.POST)
	@ResponseBody
    public Json getDepartmentuserById(@RequestBody PageDepartmentuser pageDepartmentuser){
        Json json = new Json();
        Departmentuser rDepartmentuser= DepartmentuserService.getDepartmentuserById(pageDepartmentuser);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rDepartmentuser);
        return json;
    }

    @RequestMapping(value = "/updateDepartmentuser", method = RequestMethod.POST)
	@ResponseBody
    public Json updateDepartmentuser(@RequestBody PageDepartmentuser pageDepartmentuser){
        Json json = new Json();
        try {
            DepartmentuserService.updateDepartmentuser(pageDepartmentuser);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentuserMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
