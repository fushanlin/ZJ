package com.another.Departmentuser.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageDepartmentuser extends PageModel {
	
    private Integer id;      //
    private Integer departmentid;      //
    private Integer userid;      //


    public PageDepartmentuser(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getDepartmentid(){
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid){
        this.departmentid = departmentid;
    }
    public Integer getUserid(){
        return userid;
    }

    public void setUserid(Integer userid){
        this.userid = userid;
    }

	
	
}
