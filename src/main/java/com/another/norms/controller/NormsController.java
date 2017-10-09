package com.another.norms.controller;
import com.another.base.entity.Json;
import com.another.norms.entity.Norms;
import com.another.norms.service.NormsService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/norms")
public class NormsController {
    @Autowired
    NormsService normsService;
    private Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/addnorms", method = RequestMethod.POST)
    public Json addnorms(@RequestBody Norms norms) {
        Json json = new Json();
        Norms newnorms = normsService.addnorms(norms);
        json.setCode(ResultCode.SUCCESS_CODE).setData(newnorms);
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Json update(@RequestBody Norms norms) {
        Json json = new Json();
        Norms newnorms = normsService.update(norms);
        json.setCode(ResultCode.SUCCESS_CODE).setData(newnorms);
        return json;
    }
}
