package com.wds.spring.batch.ch03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeJob;
import org.springframework.batch.core.annotation.BeforeStep;

/**
 * Created by wds on 2015/9/27.
 */
public class SystemOutStepAnnotationListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemOutStepAnnotationListener.class);

    @BeforeStep
    public void beforeStep(StepExecution execution) {

        LOGGER.info("SystemOutStepAnnotationListener Annotation Step Listener before step");

    }

    @AfterStep
    public ExitStatus afterStep(StepExecution execution) {
        LOGGER.info("SystemOutStepAnnotationListener Annotation Step Listener after step");
        return ExitStatus.COMPLETED;
    }
}
