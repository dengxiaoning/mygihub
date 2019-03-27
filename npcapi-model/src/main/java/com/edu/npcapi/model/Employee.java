package com.edu.npcapi.model;

public class Employee {
    private Integer employee_id;
    private String employee_account;
    private String username;
    private String password;
    private Integer age;
    private String address;
    private String departmentname;
    private Integer role;

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_account() {
        return employee_account;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public Integer getRole() {
        return role;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployee_account(String employee_account) {
        this.employee_account = employee_account;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setRole(Integer role) {
        this.role = role;
    }
}
