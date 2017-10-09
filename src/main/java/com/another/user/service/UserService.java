package com.another.user.service;


import com.another.user.entity.User;

import java.util.List;

/**
 * Created by wk on 2016/3/16.
 */
public interface UserService {

    public int reguser(User user);
    public int adduser(User user);
    public List<User> getuser(User user);

    public User update(User user);

    public User checkuser(User user) throws Exception;
    public int repassword(User user) throws Exception;
    public int resetpsd(User user) throws Exception;

    String sendMessage(User user) throws Exception;

}
