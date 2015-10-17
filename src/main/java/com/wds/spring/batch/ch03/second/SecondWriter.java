package com.wds.spring.batch.ch03.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by wds on 2015/9/28.
 */
public class SecondWriter implements ItemWriter<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecondWriter.class);

    @Override
    public void write(List<? extends String> items) throws Exception {
        LOGGER.info("---------SecondWriter writer----------");
    }
}
