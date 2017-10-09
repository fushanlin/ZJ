package com.another.Seatconn.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageSeatconn extends PageModel {
	
    private Integer id;      //
    private Integer publicseatid;      //公共库库区ID
    private Integer privateseatid;      //私有库区ID


    public PageSeatconn(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getPublicseatid(){
        return publicseatid;
    }

    public void setPublicseatid(Integer publicseatid){
        this.publicseatid = publicseatid;
    }
    public Integer getPrivateseatid(){
        return privateseatid;
    }

    public void setPrivateseatid(Integer privateseatid){
        this.privateseatid = privateseatid;
    }

	
	
}
