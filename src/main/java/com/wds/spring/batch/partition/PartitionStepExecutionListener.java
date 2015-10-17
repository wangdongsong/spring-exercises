package com.wds.spring.batch.partition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * Created by wds on 2015/10/2.
 */
public class PartitionStepExecutionListener implements StepExecutionListener {
    private static final Logger LOGGER = LogManager.getLogger(PartitionStepExecutionListener.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        LOGGER.info(Thread.currentThread().getName() + "; stepName=" + stepExecution.getStepName());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return null;
    }
}
