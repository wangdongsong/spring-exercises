package com.wds.spring.batch.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by wangdongsong on 2016/4/10.
 */
public class TestWriter implements ItemWriter<String> {
    private int i = 0;

    private final static Logger LOGGER = LogManager.getLogger(TestWriter.class);

    @Override
    public void write(List<? extends String> items) throws Exception {
        System.out.println(i++ + "-" + Thread.currentThread().getId());
        for (String item : items) {
            LOGGER.info("Writer: " + item);
        }
    }
}
