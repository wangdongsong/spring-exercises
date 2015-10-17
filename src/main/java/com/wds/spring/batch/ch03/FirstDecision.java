package com.wds.spring.batch.ch03;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

/**
 * Created by wds on 2015/10/1.
 */
public class FirstDecision implements JobExecutionDecider {

    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
//        if (jobExecution.getExitStatus().isRunning() && stepExecution.getExitStatus().getExitCode().equals(ExitStatus.COMPLETED)) {
//            return new FlowExecutionStatus(ExitStatus.EXECUTING.getExitCode());
//        }
        return new FlowExecutionStatus(ExitStatus.COMPLETED.getExitCode());
    }
}
