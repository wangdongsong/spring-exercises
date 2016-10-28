package com.wds.spring.batch.test;

import org.springframework.batch.item.*;

/**
 * Created by wangdongsong on 2016/4/10.
 */
public class TestReader implements ItemReader<String> {

    private int i = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        while (i < 10) {

            return " read i = " + i++;
        }
        return null;
    }

}
