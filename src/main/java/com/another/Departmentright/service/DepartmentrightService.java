package com.another.Departmentright.service;


import com.another.base.entity.Page;
import com.another.Departmentright.entity.Departmentright;
import com.another.Departmentright.pageModel.PageDepartmentright;

/**
 * Created by Zero on 2016/7/29.
 */
public interface DepartmentrightService {

    /**
     * 添加
     * @param pageDepartmentright
     * @return
     */
    void addDepartmentright(PageDepartmentright pageDepartmentright);

    /**
     * 分页获取列表
     * @param pageDepartmentright
     * @return
     */
    Page<Departmentright> getDepartmentrightList(PageDepartmentright pageDepartmentright);

    /**
     * 删除Departmentright
     * @param pageDepartmentright
     * @return
     */
    void deleteDepartmentrightById(PageDepartmentright pageDepartmentright);

    /**
     * 根据ID获取
     * @param pageDepartmentright
     * @return
     */
    Departmentright getDepartmentrightById(PageDepartmentright pageDepartmentright);

    /**
     * 修改
     * @param pageDepartmentright
     */
    void updateDepartmentright(PageDepartmentright pageDepartmentright);

}
