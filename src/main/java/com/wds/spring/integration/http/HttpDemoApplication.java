package com.wds.spring.integration.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wds on 2016/3/1.
 */
@SpringBootApplication
@ImportResource("/integration/http/servlet-config.xml")
public class HttpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpDemoApplication.class, args);
    }

}
