package com.another.user.controller;  //创建并命名一个包

import com.another.base.entity.Json;    //导入JSON类
import com.another.user.common.UserKey;
import com.another.user.common.UserMessage;
import com.another.user.entity.User;  //导入用户实体类
import com.another.user.service.UserService;  //导入业务层接口类
import com.another.base.common.ResultCode;  //导入结果代码类
import org.apache.log4j.Logger;  //导入日志记录类
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Zero on 2016/5/30.
 */
@RestController            //注解控制器
@RequestMapping("/user")//注解接口路劲
public class UserController {

    @Autowired
    UserService userService;

    private Logger logger = Logger.getLogger(this.getClass());
    @ResponseBody
    @RequestMapping(value = "/getuser", method = RequestMethod.POST)
    public Json getuser(@RequestBody User user) {
        Json json = new Json();

          List userlist = userService.getuser(user);
                json.setCode(ResultCode.SUCCESS_CODE).setData(userlist);
        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public Json regUser(@RequestBody User user) {
        Json json = new Json();
        try {
            int newid=userService.reguser(user);
            if (newid==0)
                    json.setCode(ResultCode.SUCCESS_CODE).setData(newid);//如果成功返回用户ID
            else
                json.setCode(ResultCode.FAILURE_CODE).setData(newid);//如果成功返回用
        } catch (Exception e) {
            if (e.getMessage().contains(UserKey.T_USER_PHONE_UNIQUE)) {
                json.setMsg(UserMessage.USER_PHONE_REPEAT);
            } else {
                json.setMsg(UserMessage.REG_FAIL_MSG);
                logger.error(e);
            }
        }
        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/resetpsd", method = RequestMethod.POST)
    public Json resetpsd(@RequestBody User user) {
        Json json = new Json();
        try {
            int newid=userService.resetpsd(user);
            json.setCode(ResultCode.SUCCESS_CODE).setData(newid);//如果成功返回用户ID
            } catch (Exception e) {
                json.setCode(ResultCode.FAILURE_CODE).setData(e.getMessage());
            }
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Json addUser(@RequestBody User user) {
        Json json = new Json();
        try {
            int newid=userService.adduser(user);
            if(newid==0)
                json.setCode(ResultCode.SUCCESS_CODE).setData(user.getId());//如果成功返回用户ID
            else
                json.setCode(ResultCode.FAILURE_CODE).setData(user.getId());
        } catch (Exception e) {
            if (e.getMessage().contains(UserKey.T_USER_PHONE_UNIQUE)) {
                json.setMsg(UserMessage.USER_PHONE_REPEAT);
            } else {
                json.setMsg(UserMessage.REG_FAIL_MSG);
                logger.error(e);
            }
        }
        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public Json checkUser(@RequestBody User user) {
        Json json = new Json();
        User chkuser= null;
        try {
            chkuser = userService.checkuser(user);
            json.setCode(ResultCode.SUCCESS_CODE).setData(chkuser);
        } catch (Exception e) {
            json.setCode(ResultCode.FAILURE_CODE).setData(e.getMessage());
        }
        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/repassword", method = RequestMethod.POST)
    public Json repassword(@RequestBody User user) {
        Json json = new Json();
        int row= 0;
        try {
            row = userService.repassword(user);
            json.setCode(ResultCode.SUCCESS_CODE).setData(row);
        } catch (Exception e) {
            json.setCode(ResultCode.FAILURE_CODE).setData(e.getMessage());
        }

        return json;
    }
    @ResponseBody
    @RequestMapping(value = "/sendmsg", method = RequestMethod.POST)
    public Json sendmsg(@RequestBody User user) {
        Json json = new Json();
        try {

            userService.sendMessage(user);
            json.setCode(ResultCode.SUCCESS_CODE);
        } catch (Exception e) {
            logger.error(UserMessage.SEND_MESSAGE_FAIL,e);
            json.setCode(ResultCode.FAILURE_CODE).setMsg(UserMessage.SEND_MESSAGE_FAIL);
        }
        return json;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }





}
