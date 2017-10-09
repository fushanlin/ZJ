package com.another.Creditgoods.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Creditgoods.common.CreditgoodsMessage;
import com.another.Creditgoods.entity.Creditgoods;
import com.another.Creditgoods.pageModel.PageCreditgoods;
import com.another.Creditgoods.service.CreditgoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Creditgoods")
public class CreditgoodsController {

    @Autowired
    CreditgoodsService CreditgoodsService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addCreditgoods", method = RequestMethod.POST)
	@ResponseBody
    public Json addCreditgoods(@RequestBody PageCreditgoods pageCreditgoods){
        Json json = new Json();
        try {
            CreditgoodsService.addCreditgoods(pageCreditgoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditgoodsMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteCreditgoodsById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteCreditgoods(@RequestBody PageCreditgoods pageCreditgoods){
        Json json = new Json();
        try {
            CreditgoodsService.deleteCreditgoodsById(pageCreditgoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditgoodsMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getCreditgoodsList", method = RequestMethod.POST)
	@ResponseBody
    public Json getCreditgoods(@RequestBody PageCreditgoods pageCreditgoods){
        Json json = new Json();
        Page<Creditgoods> page = CreditgoodsService.getCreditgoodsList(pageCreditgoods);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getCreditgoodsById", method = RequestMethod.POST)
	@ResponseBody
    public Json getCreditgoodsById(@RequestBody PageCreditgoods pageCreditgoods){
        Json json = new Json();
        Creditgoods rCreditgoods= CreditgoodsService.getCreditgoodsById(pageCreditgoods);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rCreditgoods);
        return json;
    }

    @RequestMapping(value = "/updateCreditgoods", method = RequestMethod.POST)
	@ResponseBody
    public Json updateCreditgoods(@RequestBody PageCreditgoods pageCreditgoods){
        Json json = new Json();
        try {
            CreditgoodsService.updateCreditgoods(pageCreditgoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(CreditgoodsMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
