package com.wds.spring.batch.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wds on 2015/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/batch/helloworld/conf/job.xml")
public class CreditBillTest {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("billJob")
    private Job job;

    @Test
    public void product() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        JobExecution result = jobLauncher.run(job, new JobParameters());
        System.out.println(result);
    }


}
