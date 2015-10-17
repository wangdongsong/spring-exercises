package com.wds.spring.batch.ch03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

/**
 * Created by wds on 2015/9/27.
 */
public class SystemOutAnnotationListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemOutAnnotationListener.class);

    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {
        LOGGER.info("SystemOutAnnotationListener before job" + jobExecution.getJobId());
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        LOGGER.info("SystemOutAnnotationListener after job" + jobExecution.getJobId());
    }
}
