package com.another.Seatconn.controller;

import com.another.base.common.ResultCode;
import com.another.base.entity.Json;
import com.another.base.entity.Page;
import com.another.Seatconn.common.SeatconnMessage;
import com.another.Seatconn.entity.Seatconn;
import com.another.Seatconn.pageModel.PageSeatconn;
import com.another.Seatconn.service.SeatconnService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/Seatconn")
public class SeatconnController {

    @Autowired
    SeatconnService SeatconnService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/addSeatconn", method = RequestMethod.POST)
	@ResponseBody
    public Json addSeatconn(@RequestBody PageSeatconn pageSeatconn){
        Json json = new Json();
        try {
            SeatconnService.addSeatconn(pageSeatconn);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(SeatconnMessage.ADD_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/deleteSeatconnById", method = RequestMethod.POST)
	@ResponseBody
    public Json deleteSeatconn(@RequestBody PageSeatconn pageSeatconn){
        Json json = new Json();
        try {
            SeatconnService.deleteSeatconnById(pageSeatconn);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(SeatconnMessage.DELETE_ERROR_MSG);
        }
        return json;
    }

    @RequestMapping(value = "/getSeatconnList", method = RequestMethod.POST)
	@ResponseBody
    public Json getSeatconn(@RequestBody PageSeatconn pageSeatconn){
        Json json = new Json();
        Page<Seatconn> page = SeatconnService.getSeatconnList(pageSeatconn);
        json.setCode(ResultCode.SUCCESS_CODE).setData(page);
        return json;
    }

    @RequestMapping(value = "/getSeatconnById", method = RequestMethod.POST)
	@ResponseBody
    public Json getSeatconnById(@RequestBody PageSeatconn pageSeatconn){
        Json json = new Json();
        Seatconn rSeatconn= SeatconnService.getSeatconnById(pageSeatconn);
        json.setCode(ResultCode.SUCCESS_CODE).setData(rSeatconn);
        return json;
    }

    @RequestMapping(value = "/updateSeatconn", method = RequestMethod.POST)
	@ResponseBody
    public Json updateSeatconn(@RequestBody PageSeatconn pageSeatconn){
        Json json = new Json();
        try {
            SeatconnService.updateSeatconn(pageSeatconn);
            json.setCode(ResultCode.SUCCESS_CODE);
        }catch (Exception ex){
            logger.error(ex);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(SeatconnMessage.UPDATE_ERROR_MSG);
        }
        return json;
    }
    
}
