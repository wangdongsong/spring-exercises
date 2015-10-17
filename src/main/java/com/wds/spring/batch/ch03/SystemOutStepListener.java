package com.wds.spring.batch.ch03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

import javax.batch.api.listener.StepListener;

/**
 * Created by wds on 2015/9/27.
 */
public class SystemOutStepListener implements StepExecutionListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemOutStepListener.class);

    @Override
    public void beforeStep(StepExecution execution) {

        LOGGER.info("SystemOutStepListener Step Listener before step");

    }

    @Override
    public ExitStatus afterStep(StepExecution execution) {
        LOGGER.info("SystemOutStepListener Step Listener after step");
        return ExitStatus.COMPLETED;
    }
}
