package com.wds.spring.batch.ch03.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.item.ItemProcessor;

import java.util.Random;

/**
 * Created by wds on 2015/9/28.
 */
public class FirstProcessor implements ItemProcessor<String, String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstProcessor.class);

    Random random = new Random();

    @Override
    public String process(String item) throws Exception {
        LOGGER.info("-----------FirstProcessor-----------");

        if (random.nextInt(10) % 2 == 0) {
            throw new RuntimeException("Error");
        }
        return "FirstProcessor---" + item;
    }
}
