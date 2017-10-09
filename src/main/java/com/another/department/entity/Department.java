package com.another.department.entity;
import java.util.Date;
/**
 * Created by 30590 on 2017-02-25 0025.
 */
public class Department {
    private int id;
    private int pid;
    private String name;
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

    public int getMasterid() {
        return masterid;
    }

    public void setMasterid(int masterid) {
        this.masterid = masterid;
    }
}
