package com.another.Departmentuser.entity;

import java.util.Date;
/**
 * 
 */
public class Departmentuser {

    private Integer id;      //
    private Integer departmentid;      //
    private Integer userid;      //


    public Departmentuser(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getDepartmentid(){
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid){
        this.departmentid = departmentid;
    }
    public Integer getUserid(){
        return userid;
    }

    public void setUserid(Integer userid){
        this.userid = userid;
    }

   
}
