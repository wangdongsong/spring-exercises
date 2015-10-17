package com.wds.spring.batch.ch03.next;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.item.ItemProcessor;

import java.util.Objects;

/**
 * Created by wds on 2015/9/28.
 */
public class PrintLogProcessor implements ItemProcessor<ExitStatus, String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintLogProcessor.class);

    @Override
    public String process(ExitStatus item) throws Exception {
        LOGGER.info(item.toString());
        return item.toString();
    }
}
