package com.another.Departmentuser.dao;

import com.another.Departmentuser.entity.Departmentuser;
import com.another.Departmentuser.pageModel.PageDepartmentuser;

import java.util.List;

/**
 * 
 */
public interface DepartmentuserDao {

    /**
     * 添加
     * @param pageDepartmentuser
     * @return
     */
    int addDepartmentuser(PageDepartmentuser pageDepartmentuser);

    /**
     * 查询列表
     * @param pageDepartmentuser
     * @return
     */
    List<Departmentuser> getDepartmentuserList(PageDepartmentuser pageDepartmentuser);

    /**
     * 查询数量
     * @return
     */
    Long getDepartmentuserSize(PageDepartmentuser pageDepartmentuser);


    /**
     * 修改信息
     * @param pageDepartmentuser
     * @return
     */
    int updateDepartmentuser(PageDepartmentuser pageDepartmentuser);

    /**
     *
     * @param pageDepartmentuser
     * @return
     */
    int deleteDepartmentuser(PageDepartmentuser pageDepartmentuser);

    /**
     *
     * @param pageDepartmentuser
     * @return
     */
    Departmentuser getDepartmentuserById(PageDepartmentuser pageDepartmentuser);
}
