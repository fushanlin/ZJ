package com.another.Bank.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Bank.common.BankMessage;
import com.another.Bank.entity.Bank;
import com.another.Bank.pageModel.PageBank;
import com.another.Bank.service.BankService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Bank")
public class BankController {

    @Autowired
    BankService BankService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addBank", method = RequestMethod.POST)
	@ResponseBody
    public Json addBank(@RequestBody PageBank pageBank){
        Json json = new Json();
        try {
            BankService.addBank(pageBank);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(BankMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteBankById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteBank(@RequestBody PageBank pageBank){
        Json json = new Json();
        try {
            BankService.deleteBankById(pageBank);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(BankMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getBankList", method = RequestMethod.POST)
	@ResponseBody
    public Json getBank(@RequestBody PageBank pageBank){
        Json json = new Json();
        Page<Bank> page = BankService.getBankList(pageBank);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getBankById", method = RequestMethod.POST)
	@ResponseBody
    public Json getBankById(@RequestBody PageBank pageBank){
        Json json = new Json();
        Bank rBank= BankService.getBankById(pageBank);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rBank);
        return json;
    }

    @RequestMapping(value = "/updateBank", method = RequestMethod.POST)
	@ResponseBody
    public Json updateBank(@RequestBody PageBank pageBank){
        Json json = new Json();
        try {
            BankService.updateBank(pageBank);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(BankMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
