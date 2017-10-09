package com.another.Bank.entity;

import java.util.Date;
/**
 * 
 */
public class Bank {

    private Integer id;      //
    private Integer pid;      //
    private String name;      //账户名称
    private String code;      //帐号
    private Integer companyid;      //公司ID
    private Integer kind;      //类型
    private String amount;      //总金额
    private String frozenamount;      //冻结金额
    private Integer state;      //账户状态
    private Integer platform;      //平台交易账户标识


    public Bank(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getPid(){
        return pid;
    }

    public void setPid(Integer pid){
        this.pid = pid;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public Integer getCompanyid(){
        return companyid;
    }

    public void setCompanyid(Integer companyid){
        this.companyid = companyid;
    }
    public Integer getKind(){
        return kind;
    }

    public void setKind(Integer kind){
        this.kind = kind;
    }
    public String getAmount(){
        return amount;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getFrozenamount(){
        return frozenamount;
    }

    public void setFrozenamount(String frozenamount){
        this.frozenamount = frozenamount;
    }
    public Integer getState(){
        return state;
    }

    public void setState(Integer state){
        this.state = state;
    }
    public Integer getPlatform(){
        return platform;
    }

    public void setPlatform(Integer platform){
        this.platform = platform;
    }

   
}
