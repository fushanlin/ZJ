package com.another.store.entity;

import com.another.base.entity.PageModel;

/**
 * Created by 30590 on 2017-03-08 0008.
 */
public class Seat extends PageModel {
    private int id;
    private int pid;
    private String name;
    private int storeid;
    private String monitor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
