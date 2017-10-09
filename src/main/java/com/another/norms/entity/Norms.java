package com.another.norms.entity;

/**
 * Created by 30590 on 2017-03-02 0002.
 */
public class Norms {
    private int id;
    private int kindid;
    private String norms;
    private int pid;


    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKindid() {
        return kindid;
    }

    public void setKindid(int kindid) {
        this.kindid = kindid;
    }

}
