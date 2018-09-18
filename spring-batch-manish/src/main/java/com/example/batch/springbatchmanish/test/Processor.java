package com.example.batch.springbatchmanish.test;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<String, String>{

	@Override
	public String process(String arg0) throws Exception {
		return arg0.toUpperCase();
	}

}
