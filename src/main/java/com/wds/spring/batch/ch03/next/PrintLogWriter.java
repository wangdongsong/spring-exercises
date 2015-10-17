package com.wds.spring.batch.ch03.next;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.Objects;

/**
 * Created by wds on 2015/9/28.
 */
public class PrintLogWriter implements ItemWriter<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintLogWriter.class);

    @Override
    public void write(List<? extends String> items) throws Exception {
        if (items != null && items.size() > 0) {
            LOGGER.info(items.get(0));
        }
    }
}
