/**
 * 
 */
package com.wds.spring.batch.ch09;

import java.util.Date;

import com.wds.spring.batch.JobLaunchBase;
import org.springframework.batch.core.JobParametersBuilder;


/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-9-30上午11:11:09
 */
public class JobLaunchConditional {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JobLaunchBase.executeJob("ch09/job/job-conditional.xml", "conditionalJob",
				new JobParametersBuilder().addDate("date", new Date())
						.addString("inputFile", "classpath:ch09/data/credit-card-bill-201310.zip")
						.addString("readFileName", "credit-card-bill-201310.csv")
						.addString("workDirectory", "file:target/ch09/work/")
						.addString("writeTarget", "file:target/ch09/conditional/outputFile.csv"));
	}
}