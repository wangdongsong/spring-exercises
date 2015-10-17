package com.wds.spring.batch.partition;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by wds on 2015/10/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/batch/partition/conf/job.xml")
public class PartitionTest {

    @Autowired
    @Qualifier("jobLauncher_partition")
    private JobLauncher partitionJobLancher;

    @Autowired
    @Qualifier("filePartitionJob")
    private Job filePartitionJob;

    @Autowired
    @Qualifier("dbPartitionJob")
    private Job dbPartitionJob;

    @Test
    public void partitionTest() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        JobParametersBuilder paramBuilder = new JobParametersBuilder();
        paramBuilder.addString("randNum", RandomStringUtils.randomAlphabetic(10));
        paramBuilder.addString("dateKey", new Date().toString());

        //JobExecution result = partitionJobLancher.run(filePartitionJob, paramBuilder.toJobParameters());
        JobExecution result = partitionJobLancher.run(dbPartitionJob, paramBuilder.toJobParameters());
        System.out.println(result);
    }
}
