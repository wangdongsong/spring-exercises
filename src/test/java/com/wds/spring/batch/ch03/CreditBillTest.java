package com.wds.spring.batch.ch03;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Random;

/**
 * Created by wds on 2015/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/batch/ch03/conf/job.xml")
public class CreditBillTest {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("billJob_ch03")
    private Job job;

    @Autowired
    @Qualifier("flowJob")
    private Job flowJob;

    @Autowired
    @Qualifier("externalJob")
    private Job externalJob;

    @Autowired
    @Qualifier("firstBaseJob")
    private Job firstBaseJob;

    @Test
    public void product() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        JobParametersBuilder paramBuilder = new JobParametersBuilder();
//        paramBuilder.addString("jobInstance", "第三个Job实例");
        paramBuilder.addString("randNum", RandomStringUtils.randomAlphabetic(10));
        paramBuilder.addString("dateKey", new Date().toString());

        //输入inputResource
        paramBuilder.addString("inputResource", "classpath:batch/ch03/data/credit-card-bill-201303.csv");

        //JobExecution result = jobLauncher.run(job, paramBuilder.toJobParameters());
        //JobExecution result = jobLauncher.run(flowJob, paramBuilder.toJobParameters());
        //JobExecution result = jobLauncher.run(externalJob, paramBuilder.toJobParameters());
        JobExecution result = jobLauncher.run(firstBaseJob, paramBuilder.toJobParameters());
        System.out.println(result);
    }


}
