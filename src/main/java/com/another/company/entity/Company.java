package com.another.company.entity;

import java.util.Date;

/**
 * Created by 30590 on 2017-02-23 0023.
 */
public class Company {
    private int id;
    private String name;
    private int pid;
    private String byname;
    private int kind;
    private String createtime;
    private Double regcapital;
    private String telephone;
    private String address;
    private String postcodes;
    private String province;
    private String city;
    private String county;
    private String representative;
    private int masterid;
    private String orgcode;
    private String image;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcodes() {
        return postcodes;
    }

    public void setPostcodes(String postcodes) {
        this.postcodes = postcodes;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public int getMasterid() {
        return masterid;
    }

    public void setMasterid(int masterid) {
        this.masterid = masterid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Double getRegcapital() {
        return regcapital;
    }

    public void setRegcapital(Double regcapital) {
        this.regcapital = regcapital;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
