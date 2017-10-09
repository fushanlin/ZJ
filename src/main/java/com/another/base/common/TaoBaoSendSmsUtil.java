package com.another.base.common;

import com.alibaba.fastjson.JSON;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * Created by 30590 on 2017-02-27 0027.
 */
public class TaoBaoSendSmsUtil {

    private final static String url = "https://eco.taobao.com/router/rest";
    private final static String appkey = "23655099";
    private final static String secret="7a85bfca994e42bd26cfac18db34d847";
    private final static String templateCode = "SMS_49415335";

    private  final static Logger logger = Logger.getLogger(TaoBaoSendSmsUtil.class);


    public static void sendSms(String code,String phoneNum) throws Exception{
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
//        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("中实交易平台");

        HashMap map = new HashMap();
        map.put("code", code);

        req.setSmsParamString(JSON.toJSONString(map));
        req.setRecNum(phoneNum);
        req.setSmsTemplateCode(templateCode);
        AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
        logger.info(rsp.toString());
    }
}
