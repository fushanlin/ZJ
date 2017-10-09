package com.another.Storeseat.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Storeseat.common.StoreseatMessage;
import com.another.Storeseat.entity.Storeseat;
import com.another.Storeseat.pageModel.PageStoreseat;
import com.another.Storeseat.service.StoreseatService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Storeseat")
public class StoreseatController {

    @Autowired
    StoreseatService StoreseatService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addStoreseat", method = RequestMethod.POST)
	@ResponseBody
    public Json addStoreseat(@RequestBody PageStoreseat pageStoreseat){
        Json json = new Json();
        try {
            StoreseatService.addStoreseat(pageStoreseat);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(StoreseatMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteStoreseatById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteStoreseat(@RequestBody PageStoreseat pageStoreseat){
        Json json = new Json();
        try {
            StoreseatService.deleteStoreseatById(pageStoreseat);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(StoreseatMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getStoreseatList", method = RequestMethod.POST)
	@ResponseBody
    public Json getStoreseat(@RequestBody PageStoreseat pageStoreseat){
        Json json = new Json();
        Page<Storeseat> page = StoreseatService.getStoreseatList(pageStoreseat);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getStoreseatById", method = RequestMethod.POST)
	@ResponseBody
    public Json getStoreseatById(@RequestBody PageStoreseat pageStoreseat){
        Json json = new Json();
        Storeseat rStoreseat= StoreseatService.getStoreseatById(pageStoreseat);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rStoreseat);
        return json;
    }

    @RequestMapping(value = "/updateStoreseat", method = RequestMethod.POST)
	@ResponseBody
    public Json updateStoreseat(@RequestBody PageStoreseat pageStoreseat){
        Json json = new Json();
        try {
            StoreseatService.updateStoreseat(pageStoreseat);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(StoreseatMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
