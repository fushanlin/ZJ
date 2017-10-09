package com.another.user.service.impl;

import com.another.base.HighArray;
import com.another.redis.RedisClientTemplate;
import com.another.redis.RedisClientTemplateMin;
import com.another.user.common.UserKey;
import com.another.user.common.UserMessage;
import com.another.user.dao.UserDao;
import com.another.user.entity.User;
import com.another.user.service.UserService;
import com.another.base.common.TaoBaoSendSmsUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2016/3/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    RedisClientTemplateMin redisClientTemplateMin;  //调用redis的帮助类
    RedisClientTemplate redisClientTemplate;
    Logger logger = Logger.getLogger(this.getClass());

    /**
     * 注册用户
     * @param user
     * @return
     */
    public int reguser(User user) {
        String code=redisClientTemplateMin.get(UserKey.VD_MSG+user.getAccount());
        if(user.getCode().equals(code)) {
            userDao.reguser(user);
            int newid = user.getId();
            return newid;
        }else
            return 0;
    }

    /**
     * 重置用户密码
     * @param user
     * @return
     */
    public int resetpsd(User user) throws Exception{
        String code=redisClientTemplateMin.get(UserKey.VD_MSG+user.getAccount());
        if(user.getCode().equals(code)) {
            int row=userDao.resetpsw(user);
            return row;
        }
            return 0;
    }

    /**
     * 获取用户列表
     * @param user
     * @return
     */
    public List<User> getuser(User user) {
        List<User> userList= null;
        userList= userDao.getuser(user);
        return userList;
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public User update(User user) {

        User newuser=userDao.updateuser(user);
        return newuser;
    }


    /**
     * 核对用户密码
     * @param user
     * @return
     * @throws Exception
     */
    public User checkuser(User user) throws Exception{

        User chkuser=userDao.checkuser(user);
        if(chkuser==null)
            throw new Exception(UserMessage.USER_ACCOUNT_ERROR );
        return chkuser;
    }

    /**
     * 修改密码
     * @param user
     * @return
     */
    public int repassword(User user) throws Exception{

        int row=userDao.repassword(user);
        if(row==0)
            throw new Exception(UserMessage.USER_ACCOUNT_ERROR );
        return row ;
    }


    public String sendMessage(User user) throws Exception {
        String randomCode = HighArray.MobileVfCode();
        String phone = user.getMphone();
        TaoBaoSendSmsUtil.sendSms(randomCode,phone);
//       redisClientTemplate.del(UserKey.VD_MSG+user.getMphone());
        redisClientTemplateMin.set(UserKey.VD_MSG+user.getMphone(),randomCode);
        return randomCode;
    }

    public int adduser(User user) {

        userDao.adduser(user);
        int newid=user.getId() ;
        return newid;
    }



}
