package com.wds.spring.batch.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by wds on 2015/9/19.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreditBillProcessor.class);

    @Override
    public CreditBill process(CreditBill item) throws Exception {
        LOGGER.info(item.toString());
        return item;
    }
}
