package com.another.base.entity;

import java.io.Serializable;

/**
 * Created by wk on 2016/3/21.
 */
public class Json implements Serializable{

    private String code;                //成功或失败
    private Object data;                //数据
    private String msg;                 //消息
    private Integer totalPage;          //总页数


    public Json(){
        code = "101";
    }

    public String getCode() {
        return code;
    }

    public Json setCode(String code) {
        this.code = code;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Json setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Json setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public Json setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

}
