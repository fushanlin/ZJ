package com.another.department.service.impl;

import com.another.department.dao.DepartmentDao;
import com.another.department.entity.Department;
import com.another.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 30590 on 2017-02-25 0025.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{   //业务逻辑实现层
        @Autowired
        private DepartmentDao departmentDao;

        public Department regdepartment(Department department) {
            departmentDao.regdepartment(department);//调用数据访问层的函数
            return department;
        }
}
