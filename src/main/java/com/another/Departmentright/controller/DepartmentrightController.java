package com.another.Departmentright.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Departmentright.common.DepartmentrightMessage;
import com.another.Departmentright.entity.Departmentright;
import com.another.Departmentright.pageModel.PageDepartmentright;
import com.another.Departmentright.service.DepartmentrightService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Departmentright")
public class DepartmentrightController {

    @Autowired
    DepartmentrightService DepartmentrightService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addDepartmentright", method = RequestMethod.POST)
	@ResponseBody
    public Json addDepartmentright(@RequestBody PageDepartmentright pageDepartmentright){
        Json json = new Json();
        try {
            DepartmentrightService.addDepartmentright(pageDepartmentright);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentrightMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteDepartmentrightById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteDepartmentright(@RequestBody PageDepartmentright pageDepartmentright){
        Json json = new Json();
        try {
            DepartmentrightService.deleteDepartmentrightById(pageDepartmentright);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentrightMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getDepartmentrightList", method = RequestMethod.POST)
	@ResponseBody
    public Json getDepartmentright(@RequestBody PageDepartmentright pageDepartmentright){
        Json json = new Json();
        Page<Departmentright> page = DepartmentrightService.getDepartmentrightList(pageDepartmentright);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getDepartmentrightById", method = RequestMethod.POST)
	@ResponseBody
    public Json getDepartmentrightById(@RequestBody PageDepartmentright pageDepartmentright){
        Json json = new Json();
        Departmentright rDepartmentright= DepartmentrightService.getDepartmentrightById(pageDepartmentright);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rDepartmentright);
        return json;
    }

    @RequestMapping(value = "/updateDepartmentright", method = RequestMethod.POST)
	@ResponseBody
    public Json updateDepartmentright(@RequestBody PageDepartmentright pageDepartmentright){
        Json json = new Json();
        try {
            DepartmentrightService.updateDepartmentright(pageDepartmentright);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(DepartmentrightMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
