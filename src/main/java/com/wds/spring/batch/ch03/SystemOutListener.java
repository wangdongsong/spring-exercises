package com.wds.spring.batch.ch03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by wds on 2015/9/27.
 */
public class SystemOutListener implements JobExecutionListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemOutListener.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        LOGGER.info("SystemOutListener Job Listener before job" + jobExecution.getJobId());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        LOGGER.info("SystemOutListener Job Listener after job" + jobExecution.getJobId());
    }
}
