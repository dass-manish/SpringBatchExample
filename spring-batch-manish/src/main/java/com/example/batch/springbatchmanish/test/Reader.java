package com.example.batch.springbatchmanish.test;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class Reader implements ItemReader<String> {

	private String[] message= {"Manish","Matrin","Lapsy","John","Robert","Kamal","Happy","Mood"};
	private int count=0;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(count<message.length) {
			return message[count++];
		}
		else
			count = 0;
		return null;
	}

}
