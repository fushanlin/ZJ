package com.another.Creditask.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Creditask.common.CreditaskMessage;
import com.another.Creditask.entity.Creditask;
import com.another.Creditask.pageModel.PageCreditask;
import com.another.Creditask.service.CreditaskService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Creditask")
public class CreditaskController {

    @Autowired
    CreditaskService CreditaskService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addCreditask", method = RequestMethod.POST)
	@ResponseBody
    public Json addCreditask(@RequestBody PageCreditask pageCreditask){
        Json json = new Json();
        try {
            CreditaskService.addCreditask(pageCreditask);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditaskMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteCreditaskById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteCreditask(@RequestBody PageCreditask pageCreditask){
        Json json = new Json();
        try {
            CreditaskService.deleteCreditaskById(pageCreditask);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditaskMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getCreditaskList", method = RequestMethod.POST)
	@ResponseBody
    public Json getCreditask(@RequestBody PageCreditask pageCreditask){
        Json json = new Json();
        Page<Creditask> page = CreditaskService.getCreditaskList(pageCreditask);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getCreditaskById", method = RequestMethod.POST)
	@ResponseBody
    public Json getCreditaskById(@RequestBody PageCreditask pageCreditask){
        Json json = new Json();
        Creditask rCreditask= CreditaskService.getCreditaskById(pageCreditask);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rCreditask);
        return json;
    }

    @RequestMapping(value = "/updateCreditask", method = RequestMethod.POST)
	@ResponseBody
    public Json updateCreditask(@RequestBody PageCreditask pageCreditask){
        Json json = new Json();
        try {
            CreditaskService.updateCreditask(pageCreditask);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditaskMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
