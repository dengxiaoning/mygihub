package com.edu.npcapi.controller;

import com.edu.npcapi.model.Employee;
import com.edu.npcapi.model.utils.Page;
import com.edu.npcapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 该案例是为测试分页功能；
 * 直接页面访问
 * http://localhost:8888/npcapi/employeeController/getAll.do?pageNum=0&pageSize=20
 * 即可获得分页面数据
 */
@Controller
@RequestMapping(value = "/employeeController")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public Page<Employee> getAll(int pageNum,int pageSize) {
        Page<Employee> page1 = employeeService.getEmployee(pageNum,pageSize);
        return page1;
    }
}

