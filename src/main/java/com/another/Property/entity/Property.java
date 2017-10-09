package com.another.Property.entity;

import java.util.Date;
/**
 * 
 */
public class Property {

    private Integer id;      //
    private String property;      //


    public Property(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getProperty(){
        return property;
    }

    public void setProperty(String property){
        this.property = property;
    }

   
}
