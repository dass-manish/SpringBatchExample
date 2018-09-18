package com.example.batch.springbatchmanish.test;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionListner extends JobExecutionListenerSupport {

	@Override
	public void afterJob(JobExecution execution) {
		if(execution.getStatus()==BatchStatus.COMPLETED) {
			System.out.println("Job Completed successfully !");
		}
	}
	
}
