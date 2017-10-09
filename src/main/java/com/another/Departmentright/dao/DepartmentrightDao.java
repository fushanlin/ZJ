package com.another.Departmentright.dao;

import com.another.Departmentright.entity.Departmentright;
import com.another.Departmentright.pageModel.PageDepartmentright;

import java.util.List;

/**
 * 
 */
public interface DepartmentrightDao {

    /**
     * 添加
     * @param pageDepartmentright
     * @return
     */
    int addDepartmentright(PageDepartmentright pageDepartmentright);

    /**
     * 查询列表
     * @param pageDepartmentright
     * @return
     */
    List<Departmentright> getDepartmentrightList(PageDepartmentright pageDepartmentright);

    /**
     * 查询数量
     * @return
     */
    Long getDepartmentrightSize(PageDepartmentright pageDepartmentright);


    /**
     * 修改信息
     * @param pageDepartmentright
     * @return
     */
    int updateDepartmentright(PageDepartmentright pageDepartmentright);

    /**
     *
     * @param pageDepartmentright
     * @return
     */
    int deleteDepartmentright(PageDepartmentright pageDepartmentright);

    /**
     *
     * @param pageDepartmentright
     * @return
     */
    Departmentright getDepartmentrightById(PageDepartmentright pageDepartmentright);
}
