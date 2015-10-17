/**
 * 
 */
package com.wds.spring.batch.ch09.tasklet;

import com.wds.spring.batch.ch09.CreditService;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-10-7上午10:18:34
 */
public class DecompressTasklet implements Tasklet {
	private CreditService creditService;
	private String inputFile;
	private String outputDirectory;
	/* (non-Javadoc)
	 * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.springframework.batch.core.StepContribution, org.springframework.batch.core.scope.context.ChunkContext)
	 */
	@Override
	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		System.out.println("---------------------");
		creditService.decompress(inputFile, outputDirectory);
		return RepeatStatus.FINISHED;
	}
	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
}
