package com.another.Storeseat.entity;

import java.util.Date;
/**
 * 
 */
public class Storeseat {

    private Integer id;      //
    private Integer pid;      //上级库位ID
    private String name;      //库位
    private Integer storeid;      //仓库ID
    private String monitor;      //监控摄像头连接


    public Storeseat(){

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
    public Integer getStoreid(){
        return storeid;
    }

    public void setStoreid(Integer storeid){
        this.storeid = storeid;
    }
    public String getMonitor(){
        return monitor;
    }

    public void setMonitor(String monitor){
        this.monitor = monitor;
    }

   
}
