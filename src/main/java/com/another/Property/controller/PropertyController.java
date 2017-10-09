package com.another.Property.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Property.common.PropertyMessage;
import com.another.Property.entity.Property;
import com.another.Property.pageModel.PageProperty;
import com.another.Property.service.PropertyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Property")
public class PropertyController {

    @Autowired
    PropertyService PropertyService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addProperty", method = RequestMethod.POST)
	@ResponseBody
    public Json addProperty(@RequestBody PageProperty pageProperty){
        Json json = new Json();
        try {
            PropertyService.addProperty(pageProperty);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(PropertyMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deletePropertyById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteProperty(@RequestBody PageProperty pageProperty){
        Json json = new Json();
        try {
            PropertyService.deletePropertyById(pageProperty);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(PropertyMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getPropertyList", method = RequestMethod.POST)
	@ResponseBody
    public Json getProperty(@RequestBody PageProperty pageProperty){
        Json json = new Json();
        Page<Property> page = PropertyService.getPropertyList(pageProperty);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getPropertyById", method = RequestMethod.POST)
	@ResponseBody
    public Json getPropertyById(@RequestBody PageProperty pageProperty){
        Json json = new Json();
        Property rProperty= PropertyService.getPropertyById(pageProperty);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rProperty);
        return json;
    }

    @RequestMapping(value = "/updateProperty", method = RequestMethod.POST)
	@ResponseBody
    public Json updateProperty(@RequestBody PageProperty pageProperty){
        Json json = new Json();
        try {
            PropertyService.updateProperty(pageProperty);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(PropertyMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
