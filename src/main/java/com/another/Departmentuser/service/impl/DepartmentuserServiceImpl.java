package com.another.Departmentuser.service.impl;

import com.another.base.entity.Page;
import com.another.Departmentuser.dao.DepartmentuserDao;
import com.another.Departmentuser.entity.Departmentuser;
import com.another.Departmentuser.pageModel.PageDepartmentuser;
import com.another.Departmentuser.service.DepartmentuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class DepartmentuserServiceImpl implements DepartmentuserService {

    @Autowired
    DepartmentuserDao Departmentuserdao;

    @Override
    public void addDepartmentuser(PageDepartmentuser pageDepartmentuser) {
        Departmentuserdao.addDepartmentuser(pageDepartmentuser);
    }

    @Override
    public Page<Departmentuser> getDepartmentuserList(PageDepartmentuser pageDepartmentuser) {
        Page<Departmentuser> page = new Page<Departmentuser>();

        Long size = Departmentuserdao.getDepartmentuserSize(pageDepartmentuser);
        pageDepartmentuser.setTotal(size);

        List<Departmentuser> list = Departmentuserdao.getDepartmentuserList(pageDepartmentuser);
        page.setTotal(size);
        page.setTotalPages(pageDepartmentuser.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteDepartmentuserById(PageDepartmentuser pageDepartmentuser) {
        Departmentuserdao.deleteDepartmentuser(pageDepartmentuser);
    }

    @Override
    public Departmentuser getDepartmentuserById(PageDepartmentuser pageDepartmentuser) {
        Departmentuser  rDepartmentuser = Departmentuserdao.getDepartmentuserById(pageDepartmentuser);
        return rDepartmentuser;
    }

    @Override
    public void updateDepartmentuser(PageDepartmentuser pageDepartmentuser) {
        Departmentuserdao.updateDepartmentuser(pageDepartmentuser);
    }
}
