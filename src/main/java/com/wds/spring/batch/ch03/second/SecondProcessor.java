package com.wds.spring.batch.ch03.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by wds on 2015/9/28.
 */
public class SecondProcessor implements ItemProcessor<ExitStatus, String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecondProcessor.class);

    @Override
    public String process(ExitStatus item) throws Exception {
        LOGGER.info("-----------SecondProcessor-----------");
        return "SecondProcessor";
    }
}
