package com.another.user.dao;


import com.another.base.MyBatisRepository;
import com.another.user.entity.User;
import com.another.user.pageModel.PageUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wk on 2016/3/17.
 */

public interface UserDao {
    /**
     * 注册用户
     * @param user
     * @return
     */
    public int reguser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int adduser(User user);

    /**
     * 获取用户列表
     * @param user
     * @return
     */
    public List<User> getuser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public User updateuser(User user);

    /**
     * 核对用户密码
     * @param user
     * @return
     */
    public User checkuser(User user);

    /**
     * 修改用户密码
     * @param user
     * @return
     */
    public int repassword(User user);

    /**
     * 短信重置密码
     * @param user
     * @return
     */
    public int resetpsw(User user);




}
