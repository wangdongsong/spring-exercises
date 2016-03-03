package com.wds.spring.integration.rest.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by wds on 2016/3/2.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employeeId",
        "fname",
        "lname"
})
@XmlRootElement(name = "Customer")
public class Employee {

    private Integer employeeId;
    private String fname;
    private String lname;

    public Employee() {
    }

    public Employee(Integer employeeId, String fname, String lname) {
        this.employeeId = employeeId;
        this.fname = fname;
        this.lname = lname;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
