package com.another.Seatconn.entity;

import java.util.Date;
/**
 * 
 */
public class Seatconn {

    private Integer id;      //
    private Integer publicseatid;      //公共库库区ID
    private Integer privateseatid;      //私有库区ID


    public Seatconn(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getPublicseatid(){
        return publicseatid;
    }

    public void setPublicseatid(Integer publicseatid){
        this.publicseatid = publicseatid;
    }
    public Integer getPrivateseatid(){
        return privateseatid;
    }

    public void setPrivateseatid(Integer privateseatid){
        this.privateseatid = privateseatid;
    }

   
}
