package com.another.Goodsprolist.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageGoodsprolist extends PageModel {
	
    private Integer id;      //
    private Integer goodskindid;      //
    private Integer propertyid;      //


    public PageGoodsprolist(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getGoodskindid(){
        return goodskindid;
    }

    public void setGoodskindid(Integer goodskindid){
        this.goodskindid = goodskindid;
    }
    public Integer getPropertyid(){
        return propertyid;
    }

    public void setPropertyid(Integer propertyid){
        this.propertyid = propertyid;
    }

	
	
}
