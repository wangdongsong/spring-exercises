package com.wds.spring.integration.rest.service;

import com.wds.spring.integration.rest.domain.Employee;
import com.wds.spring.integration.rest.domain.EmployeeList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wds on 2016/3/2.
 */
@Service("employeeSearchService")
public class EmployeeSearchService {
    private static final Logger LOGGER = LogManager.getLogger(EmployeeSearchService.class);

    public Message<EmployeeList> getEmployee(Message<?> inMessage) {
        EmployeeList employeeList = new EmployeeList();

        Map<String, Object> responseHeaderMap = new HashMap<>();

        try {
            MessageHeaders headers = inMessage.getHeaders();
            String id = (String) headers.get("employeeId");
            boolean isFound;
            if (id.equals("1")) {
                employeeList.getEmployee().add(new Employee(1, "John", "Doe"));
                isFound = true;
            } else if (id.equals("2")) {
                employeeList.getEmployee().add(new Employee(2, "Jane", "Doe"));
                isFound = true;
            } else if (id.equals("0")) {
                employeeList.getEmployee().add(new Employee(1, "John", "Doe"));
                employeeList.getEmployee().add(new Employee(2, "Jane", "Doe"));
                isFound = true;
            } else {
                isFound = false;
            }
            if (isFound) {
                setReturnStatusAndMessage("0", "Success", employeeList, responseHeaderMap);
            } else {
                setReturnStatusAndMessage("2", "Employee Not Found", employeeList, responseHeaderMap);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        Message<EmployeeList> message = new GenericMessage<EmployeeList>(employeeList, responseHeaderMap);
        return message;
    }

    private void setReturnStatusAndMessage(String status,
                                           String message,
                                           EmployeeList employeeList,
                                           Map<String, Object> responseHeaderMap){

        employeeList.setReturnStatus(status);
        employeeList.setReturnStatusMsg(message);
        responseHeaderMap.put("Return-Status", status);
        responseHeaderMap.put("Return-Status-Msg", message);
    }
}
