package com.another.store.entity;

import com.another.base.entity.PageModel;

/**
 * Created by 30590 on 2017-03-07 0007.
 */
public class Store extends PageModel {
    private int id;
    private int pid;
    private String name;
    private String address;
    private String telephone;
    private String coordinate;
    private int state;
    private int label;
    private int masterid;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public int getMasterid() {
        return masterid;
    }

    public void setMasterid(int masterid) {
        this.masterid = masterid;
    }
}
