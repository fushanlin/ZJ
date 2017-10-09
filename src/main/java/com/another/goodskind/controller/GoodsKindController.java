package com.another.goodskind.controller;

import com.another.base.entity.Json;
import com.another.goodskind.entity.GoodsKind;
import com.another.goodskind.service.GoodsKindService;
import com.another.base.common.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 30590 on 2017-02-23 0023.
 */
@RestController
@RequestMapping("/goodsKind")
public class GoodsKindController {
    @Autowired
    GoodsKindService goodsKindService;
    private Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/addGoodsKind", method = RequestMethod.POST)
    public Json addGoodsKind(@RequestBody GoodsKind goodsKind) {
        Json json = new Json();
        try {
            if (goodsKindService.addGoodsKind(goodsKind))
                json.setCode(ResultCode.SUCCESS_CODE).setCode("添加成功！");
            else
                json.setCode(ResultCode.FAILURE_CODE).setCode("添加失败！");

        } catch (Exception e) {

            json.setCode(ResultCode.FAILURE_CODE).setCode(e.getMessage());
            logger.error("异常", e);
        }
        return json;

    }

    @ResponseBody
    @RequestMapping(value = "/updateGoodsKind", method = RequestMethod.POST)
    public Json updateGoodsKind(@RequestBody GoodsKind goodsKind) {
        Json json = new Json();
        try {
            if (goodsKindService.updateGoodsKind(goodsKind))
                json.setCode(ResultCode.SUCCESS_CODE).setCode("修改成功！");
            else
                json.setCode(ResultCode.FAILURE_CODE).setCode("修改失败！");

        } catch (Exception e) {

            json.setCode(ResultCode.FAILURE_CODE).setCode(e.getMessage());
            logger.error("异常", e);
        }
        return json;

    }

    @ResponseBody
    @RequestMapping(value = "/deleteGoodsKind", method = RequestMethod.POST)
    public Json deleteGoodsKind(@RequestBody GoodsKind goodsKind) {
        Json json = new Json();
        try {
            if (goodsKindService.deleteGoodsKind(goodsKind))
                json.setCode(ResultCode.SUCCESS_CODE).setCode("删除成功！");
            else
                json.setCode(ResultCode.FAILURE_CODE).setCode("删除失败！");

        } catch (Exception e) {

            json.setCode(ResultCode.FAILURE_CODE).setCode(e.getMessage());
            logger.error("异常", e);
        }
        return json;

    }

    @ResponseBody
    @RequestMapping(value = "/getGoodsKinds", method = RequestMethod.POST)
    public Json getGoodsKinds(@RequestBody GoodsKind goodsKind) {
        Json json = new Json();
        try {
            List<GoodsKind> goodsKinds = goodsKindService.getGoodsKinds();
            if (goodsKinds != null && goodsKinds.size() > 0)
                json.setCode(ResultCode.SUCCESS_CODE).setData(goodsKinds);
            else
                json.setCode(ResultCode.FAILURE_CODE).setMsg("没有查询到数据！");
        } catch (Exception e) {
            json.setCode(ResultCode.FAILURE_CODE).setCode(e.getMessage());
            logger.error("异常", e);
        }
        return json;

    }

}
