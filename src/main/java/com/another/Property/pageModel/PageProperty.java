package com.another.Property.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageProperty extends PageModel {
	
    private Integer id;      //
    private String property;      //


    public PageProperty(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getProperty(){
        return property;
    }

    public void setProperty(String property){
        this.property = property;
    }

	
	
}
