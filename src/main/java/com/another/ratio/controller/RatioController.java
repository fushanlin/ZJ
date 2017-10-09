package com.another.ratio.controller;

import com.another.base.entity.Json;
import com.another.ratio.entity.Ratio;
import com.another.ratio.service.RatioService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 30590 on 2017-02-28 0028.
 */

@RestController
@RequestMapping("/ratio")
public class RatioController {
    @Autowired
    RatioService ratioService;
    private Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Json addRatio(@RequestBody Ratio ratio) {
        Json json = new Json();
        int newid= ratioService.addratio(ratio);
        if(newid==0)
            json.setCode(ResultCode.FAILURE_CODE).setData(ratio.getId());
            else
            json.setCode(ResultCode.SUCCESS_CODE).setData(ratio.getId());
        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/getratio", method = RequestMethod.POST)
    public Json getratio(@RequestBody Ratio ratio) {
        Json json = new Json();

        List ratiolist = ratioService.getratio(ratio);
        json.setCode(ResultCode.SUCCESS_CODE).setData(ratiolist);
        return json;
    }
}

