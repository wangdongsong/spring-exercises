package com.wds.spring.batch.ch03.first;

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
public class FirstReader implements ItemReader<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstReader.class);
    private int index = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        LOGGER.info("---------------------FirstReader read---------------");
        if (index < 5) {
            index++;
            return ExitStatus.COMPLETED.toString();
        }else{
            return null;
        }
    }
}
