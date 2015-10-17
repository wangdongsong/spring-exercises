package com.wds.spring.batch.ch03;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.SkipListener;

/**
 * Created by wds on 2015/10/1.
 */
public class FirstSkipListener implements SkipListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(FirstSkipListener.class);

    @Override
    public void onSkipInRead(Throwable t) {
        LOGGER.error(t.getMessage(), t);
    }

    @Override
    public void onSkipInWrite(Object item, Throwable t) {
        LOGGER.error("skip in write: ", item);
        LOGGER.error(t.getMessage() + " on write", t);
    }

    @Override
    public void onSkipInProcess(Object item, Throwable t) {
        LOGGER.error("skip in process: ", item);
        LOGGER.error(t.getMessage() + " on write", t);
    }
}
