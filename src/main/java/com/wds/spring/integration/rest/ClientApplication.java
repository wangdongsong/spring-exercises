package com.wds.spring.integration.rest;

import com.wds.spring.integration.rest.domain.EmployeeList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wds on 2016/3/2.
 */
public class ClientApplication {
    private static final Logger LOGGER = LogManager.getLogger(ClientApplication.class);

    private static HttpMessageConverterExtractor<EmployeeList> responseExtractor;

    public ClientApplication(HttpMessageConverterExtractor<EmployeeList> responseExtractor) {
        this.responseExtractor = responseExtractor;
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/integration/rest/http-outbound-config.xml");

        RestTemplate restTemplate = (RestTemplate)context.getBean("restTemplate");

        responseExtractor =  new HttpMessageConverterExtractor<EmployeeList>(EmployeeList.class, restTemplate.getMessageConverters());

        Map<String, Object> employeeSearchMap = getEmployeeSearchMap("0");

        final String fullUrl = "http://localhost:8081/services/employee/{id}/search";

        EmployeeList employeeList = restTemplate.execute(fullUrl, HttpMethod.GET,
                new RequestCallback() {
                    @Override
                    public void doWithRequest(ClientHttpRequest request) throws IOException {
                        HttpHeaders headers = request.getHeaders();
                        headers.add("Accept", "application/json");
                    }
                }, responseExtractor, employeeSearchMap);

        LOGGER.info("The employee list size :" + employeeList.getEmployee().size());
    }

    private static Map<String, Object> getEmployeeSearchMap(String id) {
        Map<String, Object> employeeSearchMap = new HashMap<String, Object>();
        employeeSearchMap.put("id", id);
        return employeeSearchMap;
    }
}
