package com.another.Goods.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Goods.common.GoodsMessage;
import com.another.Goods.entity.Goods;
import com.another.Goods.pageModel.PageGoods;
import com.another.Goods.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Goods")
public class GoodsController {

    @Autowired
    GoodsService GoodsService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
	@ResponseBody
    public Json addGoods(@RequestBody PageGoods pageGoods){
        Json json = new Json();
        try {
            GoodsService.addGoods(pageGoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteGoodsById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteGoods(@RequestBody PageGoods pageGoods){
        Json json = new Json();
        try {
            GoodsService.deleteGoodsById(pageGoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getGoodsList", method = RequestMethod.POST)
	@ResponseBody
    public Json getGoods(@RequestBody PageGoods pageGoods){
        Json json = new Json();
        Page<Goods> page = GoodsService.getGoodsList(pageGoods);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getGoodsById", method = RequestMethod.POST)
	@ResponseBody
    public Json getGoodsById(@RequestBody PageGoods pageGoods){
        Json json = new Json();
        Goods rGoods= GoodsService.getGoodsById(pageGoods);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rGoods);
        return json;
    }

    @RequestMapping(value = "/updateGoods", method = RequestMethod.POST)
	@ResponseBody
    public Json updateGoods(@RequestBody PageGoods pageGoods){
        Json json = new Json();
        try {
            GoodsService.updateGoods(pageGoods);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(GoodsMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
