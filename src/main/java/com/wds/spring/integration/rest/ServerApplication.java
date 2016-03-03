package com.wds.spring.integration.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wds on 2016/3/2.
 */
@SpringBootApplication
@ImportResource("/integration/rest/applicationContext-rest.xml")
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
