package com.example.batch.springbatchmanish.test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class BatchConfig {

	@Autowired
	private JobBuilderFactory builderFactory;
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Job processJob() {
		return builderFactory.get("processJob").incrementer(new RunIdIncrementer()).listener(listner()).flow(orderStep()).end().build();
	}
	
	@Bean
	public Step orderStep() {
		return stepBuilderFactory.get("orderStep").<String,String> chunk(1).reader(new Reader()).processor(new Processor()).writer(new Writer()).build();
	}
	
	@Bean
	public JobExecutionListener listner() {
		return new JobCompletionListner();
	}
}