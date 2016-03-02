package com.wds.spring.integration.http;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wds on 2016/3/2.
 */
public class HttpClient {

    private static final Logger LOGGER = LogManager.getLogger(HttpClient.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/integration/http/http-outbound-config.xml");
        RequestGateway requestGateway = context.getBean("requestGateway", RequestGateway.class);
        String replay = requestGateway.echo("Hello");

        LOGGER.info("Replied with: " + replay);
    }



}
