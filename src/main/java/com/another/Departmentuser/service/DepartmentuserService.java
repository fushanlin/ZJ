package com.another.Departmentuser.service;


import com.another.base.entity.Page;
import com.another.Departmentuser.entity.Departmentuser;
import com.another.Departmentuser.pageModel.PageDepartmentuser;

/**
 * Created by Zero on 2016/7/29.
 */
public interface DepartmentuserService {

    /**
     * 添加
     * @param pageDepartmentuser
     * @return
     */
    void addDepartmentuser(PageDepartmentuser pageDepartmentuser);

    /**
     * 分页获取列表
     * @param pageDepartmentuser
     * @return
     */
    Page<Departmentuser> getDepartmentuserList(PageDepartmentuser pageDepartmentuser);

    /**
     * 删除Departmentuser
     * @param pageDepartmentuser
     * @return
     */
    void deleteDepartmentuserById(PageDepartmentuser pageDepartmentuser);

    /**
     * 根据ID获取
     * @param pageDepartmentuser
     * @return
     */
    Departmentuser getDepartmentuserById(PageDepartmentuser pageDepartmentuser);

    /**
     * 修改
     * @param pageDepartmentuser
     */
    void updateDepartmentuser(PageDepartmentuser pageDepartmentuser);

}
