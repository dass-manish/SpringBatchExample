package com.example.batch.springbatchmanish.test;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Writer implements ItemWriter<String> {

	@Autowired
	private ActivityService activityService;
	
	@Override
	public void write(List<? extends String> arg0) throws Exception {
		for(String s:arg0) {
			Activity activity= new Activity();
			activity.setName(s);
			try {
				activityService.saveActivity(activity);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(activity.toString());
		}
	}
}