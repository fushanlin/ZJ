package com.another.Goodsprolist.entity;

import java.util.Date;
/**
 * 
 */
public class Goodsprolist {

    private Integer id;      //
    private Integer goodskindid;      //
    private Integer propertyid;      //


    public Goodsprolist(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getGoodskindid(){
        return goodskindid;
    }

    public void setGoodskindid(Integer goodskindid){
        this.goodskindid = goodskindid;
    }
    public Integer getPropertyid(){
        return propertyid;
    }

    public void setPropertyid(Integer propertyid){
        this.propertyid = propertyid;
    }

   
}
