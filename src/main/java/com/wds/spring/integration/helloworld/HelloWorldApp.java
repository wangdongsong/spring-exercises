package com.wds.spring.integration.helloworld;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * Created by wds on 2016/3/1.
 */
public class HelloWorldApp {

    private static final Logger LOGGER = LogManager.getLogger(HelloWorldApp.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/integration/helloworld/helloworld.xml");
        MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
        PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
        inputChannel.send(new GenericMessage<String>("World"));
        LOGGER.info("==> HelloWorldDemo: " + outputChannel.receive(0).getPayload());
    }

}
