package com.edu.npcapi.dao;

import com.edu.npcapi.model.Employee;
import com.edu.npcapi.model.utils.Page;

import java.util.List;

public interface EmployeeDao {
    //获取数据的总条数，即totalRecord
    int getEmployeeTotal();
    //获取指定的数据
    List<Employee> getAllEmployee(Page<Employee> page);
}
