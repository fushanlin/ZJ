package com.another.store.controller;

import com.another.base.entity.Json;
import com.another.store.entity.Seat;
import com.another.store.entity.Store;
import com.another.store.service.StoreService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 30590 on 2017-03-08 0008.
 */
@RestController            //注解控制器
@RequestMapping("/store") //注解接口路劲
public class StoreConntroller {

    @Autowired
    StoreService storeService;

    private Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Json addstore(@RequestBody Store store) {
        Json json = new Json();

            storeService.addstore(store);
            if (store.getReturned()==1)
                json.setCode(ResultCode.FAILURE_CODE);//如果成功返回用
               else
                json.setCode(ResultCode.SUCCESS_CODE).setData(store);//如果成功返回用户ID

          return json;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Json updatestore(@RequestBody Store store) {
        Json json = new Json();

        storeService.updatestore(store);
        if (store.getReturned()==1)
            json.setCode(ResultCode.FAILURE_CODE);//如果成功返回用
        else
            json.setCode(ResultCode.SUCCESS_CODE).setData(store);//如果成功返回用户ID

        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/addseat", method = RequestMethod.POST)
    public Json addseat(@RequestBody Seat seat) {
        Json json = new Json();

        storeService.addseat(seat);
        if (seat.getReturned()==1)
            json.setCode(ResultCode.FAILURE_CODE);//如果失败返回1
        else
            json.setCode(ResultCode.SUCCESS_CODE).setData(seat);//如果成功返回0

        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/updateseat", method = RequestMethod.POST)
    public Json updateseat(@RequestBody Seat seat) {
        Json json = new Json();

        try {
            storeService.updateseat(seat);
            if (seat.getReturned()==1)
                json.setCode(ResultCode.FAILURE_CODE);//如果成功返回用
            else
                json.setCode(ResultCode.SUCCESS_CODE).setData(seat);//如果成功返回用户ID
        }catch (Exception ex){
            logger.error("updateseat==",ex);
            json.setCode(ResultCode.FAILURE_CODE);//如果成功返回用
        }
        return json;
    }

}
