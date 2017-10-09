package com.another.ratio.entity;
import java.util.Date;
/**
 * Created by 30590 on 2017-02-28 0028.
 */
public class Ratio {
    private int id;
    private int crdtgoodsid;
    private int componentid;
    private int ratio;
    private int propertyid;
    private String property;
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    private String values;
    public int getComponentid() {
        return componentid;
    }

    public void setComponentid(int componentid) {
        this.componentid = componentid;
    }

    public int getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(int propertyid) {
        this.propertyid = propertyid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCrdtgoodsid() {
        return crdtgoodsid;
    }

    public void setCrdtgoodsid(int crdtgoodsid) {
        this.crdtgoodsid = crdtgoodsid;
    }


    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }


}

