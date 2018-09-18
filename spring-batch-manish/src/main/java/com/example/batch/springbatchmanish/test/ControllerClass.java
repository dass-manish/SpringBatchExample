package com.example.batch.springbatchmanish.test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job processJob;
	
	
	@RequestMapping("/invokejob")
	public String handle()throws Exception{
		JobParameters p= new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(processJob, p);
		return "Jobs are Completed !";
	}
}
