package com.wds.spring.batch.test;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by wangdongsong on 2016/4/10.
 */
public class TestProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String item) throws Exception {
        return item + " end of processed!";
    }
}
