package com.another.Departmentright.pageModel;

import com.another.base.entity.PageModel;
import java.util.Date;
/**
 * 
 */
public class PageDepartmentright extends PageModel {
	
    private Integer id;      //
    private Integer departmentid;      //
    private Integer rightid;      //
    private Integer spec;      //部门领导特权标签 1为部门领导特权


    public PageDepartmentright(){

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
    public Integer getRightid(){
        return rightid;
    }

    public void setRightid(Integer rightid){
        this.rightid = rightid;
    }
    public Integer getSpec(){
        return spec;
    }

    public void setSpec(Integer spec){
        this.spec = spec;
    }

	
	
}
