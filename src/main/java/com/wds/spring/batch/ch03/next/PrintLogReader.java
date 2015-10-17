package com.wds.spring.batch.ch03.next;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by wds on 2015/9/28.
 */
public class PrintLogReader implements ItemReader<ExitStatus> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintLogReader.class);

    @Override
    public ExitStatus read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        LOGGER.info("PrintLogReader read the content");
        return ExitStatus.COMPLETED;
    }
}
