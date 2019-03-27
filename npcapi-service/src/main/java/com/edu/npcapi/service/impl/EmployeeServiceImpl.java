package com.edu.npcapi.service.impl;

import com.edu.npcapi.dao.EmployeeDao;
import com.edu.npcapi.model.Employee;
import com.edu.npcapi.model.utils.Page;
import com.edu.npcapi.service.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    private Logger log = Logger.getLogger(EmployeeServiceImpl.class);

    @Override
    public Page<Employee> getEmployee(int pageNum,int pageSize) {
        //获取总条数，即totalRecord
        int total = employeeDao.getEmployeeTotal();
        Page<Employee> allpage = new Page<Employee>(pageNum, pageSize, total);
        log.info("allpage:" + allpage.toString());
        //将获取到的集合数据，添加到page中的datalist参数中
        allpage.setDateList(employeeDao.getAllEmployee(allpage));
        //返回所有的分页参数和数据
        return allpage;
    }

}

