package com.another.Goodsprolist.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Goodsprolist.common.GoodsprolistMessage;
import com.another.Goodsprolist.entity.Goodsprolist;
import com.another.Goodsprolist.pageModel.PageGoodsprolist;
import com.another.Goodsprolist.service.GoodsprolistService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Goodsprolist")
public class GoodsprolistController {

    @Autowired
    GoodsprolistService GoodsprolistService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addGoodsprolist", method = RequestMethod.POST)
	@ResponseBody
    public Json addGoodsprolist(@RequestBody PageGoodsprolist pageGoodsprolist){
        Json json = new Json();
        try {
            GoodsprolistService.addGoodsprolist(pageGoodsprolist);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsprolistMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteGoodsprolistById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteGoodsprolist(@RequestBody PageGoodsprolist pageGoodsprolist){
        Json json = new Json();
        try {
            GoodsprolistService.deleteGoodsprolistById(pageGoodsprolist);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsprolistMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getGoodsprolistList", method = RequestMethod.POST)
	@ResponseBody
    public Json getGoodsprolist(@RequestBody PageGoodsprolist pageGoodsprolist){
        Json json = new Json();
        Page<Goodsprolist> page = GoodsprolistService.getGoodsprolistList(pageGoodsprolist);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getGoodsprolistById", method = RequestMethod.POST)
	@ResponseBody
    public Json getGoodsprolistById(@RequestBody PageGoodsprolist pageGoodsprolist){
        Json json = new Json();
        Goodsprolist rGoodsprolist= GoodsprolistService.getGoodsprolistById(pageGoodsprolist);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rGoodsprolist);
        return json;
    }

    @RequestMapping(value = "/updateGoodsprolist", method = RequestMethod.POST)
	@ResponseBody
    public Json updateGoodsprolist(@RequestBody PageGoodsprolist pageGoodsprolist){
        Json json = new Json();
        try {
            GoodsprolistService.updateGoodsprolist(pageGoodsprolist);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsprolistMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
