package com.another.ratio.service.impl;

import com.another.ratio.dao.RatioDao;
import com.another.ratio.entity.Ratio;
import com.another.ratio.service.RatioService;
import com.another.redis.RedisClientTemplate;
import com.another.redis.RedisClientTemplateMin;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 30590 on 2017-02-28 0028.
 */
@Service
public class RatioServiceImpl implements RatioService {
    @Autowired
    private RatioDao ratioDao;

    @Autowired
    RedisClientTemplateMin redisClientTemplateMin;  //调用redis的帮助类
    RedisClientTemplate redisClientTemplate;
    Logger logger = Logger.getLogger(this.getClass());


    public int addratio(Ratio ratio) {
           int newid=ratioDao.addratio(ratio);
            return newid;
        }
    public List<Ratio> getratio(Ratio ratio) {
        List<Ratio> listratio=ratioDao.getratio(ratio);
        return listratio;
    }
}