package com.edu.npcapi.service;

import com.edu.npcapi.model.Employee;
import com.edu.npcapi.model.utils.Page;

public interface EmployeeService {
    //返回分页数据和主题信息
    Page<Employee> getEmployee(int pageNum, int pageSize);
}

