package com.wds.spring.integration.rest.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wds on 2016/3/2.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employees",
        "returnStatus",
        "returnStatusMsg"
})
@XmlRootElement(name = "EmployeeList")
public class EmployeeList {
    @XmlElement(name = "Employee", required = true)
    private List<Employee> employees;

    @XmlElement(name = "returnStatus", required = true)
    private String returnStatus;

    @XmlElement(name = "returnStatusMsg", required = true)
    private String returnStatusMsg;

    public List<Employee> getEmployee() {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        return employees;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public String getReturnStatusMsg() {
        return returnStatusMsg;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void setReturnStatusMsg(String returnStatusMsg) {
        this.returnStatusMsg = returnStatusMsg;
    }
}
