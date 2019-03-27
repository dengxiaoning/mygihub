package com.edu.npcapi.test;

import com.edu.npcapi.model.Employee;
import com.edu.npcapi.model.utils.Page;
import com.edu.npcapi.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class PageTest {
    @Resource
    private EmployeeService employeeService;

    @Test
    public void queryEmployee()throws Exception{
        Page<Employee> page =  employeeService.getEmployee(1,5);
        System.out.println("打印总条数：");
        System.out.println(page.getTotalRecord());
        System.out.println("打印总页数：");
        System.out.println(page.getTotalPage());

        for(Employee employee : page.getDateList()){
            System.out.print(employee.getDepartmentname()+":");
            System.out.println(employee.getUsername());

        }
    }
}
