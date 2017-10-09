package com.another.Creditgoods.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageCreditgoods extends PageModel {
	
    private Integer id;      //
    private Integer creditaskid;      //开证ID
    private Integer goodskind;      //品名id


    public PageCreditgoods(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getCreditaskid(){
        return creditaskid;
    }

    public void setCreditaskid(Integer creditaskid){
        this.creditaskid = creditaskid;
    }
    public Integer getGoodskind(){
        return goodskind;
    }

    public void setGoodskind(Integer goodskind){
        this.goodskind = goodskind;
    }

	
	
}
