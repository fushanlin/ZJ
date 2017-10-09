package com.another.Departmentright.service.impl;

import com.another.base.entity.Page;
import com.another.Departmentright.dao.DepartmentrightDao;
import com.another.Departmentright.entity.Departmentright;
import com.another.Departmentright.pageModel.PageDepartmentright;
import com.another.Departmentright.service.DepartmentrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class DepartmentrightServiceImpl implements DepartmentrightService {

    @Autowired
    DepartmentrightDao Departmentrightdao;

    @Override
    public void addDepartmentright(PageDepartmentright pageDepartmentright) {
        Departmentrightdao.addDepartmentright(pageDepartmentright);
    }

    @Override
    public Page<Departmentright> getDepartmentrightList(PageDepartmentright pageDepartmentright) {
        Page<Departmentright> page = new Page<Departmentright>();

        Long size = Departmentrightdao.getDepartmentrightSize(pageDepartmentright);
        pageDepartmentright.setTotal(size);

        List<Departmentright> list = Departmentrightdao.getDepartmentrightList(pageDepartmentright);
        page.setTotal(size);
        page.setTotalPages(pageDepartmentright.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteDepartmentrightById(PageDepartmentright pageDepartmentright) {
        Departmentrightdao.deleteDepartmentright(pageDepartmentright);
    }

    @Override
    public Departmentright getDepartmentrightById(PageDepartmentright pageDepartmentright) {
        Departmentright  rDepartmentright = Departmentrightdao.getDepartmentrightById(pageDepartmentright);
        return rDepartmentright;
    }

    @Override
    public void updateDepartmentright(PageDepartmentright pageDepartmentright) {
        Departmentrightdao.updateDepartmentright(pageDepartmentright);
    }
}
