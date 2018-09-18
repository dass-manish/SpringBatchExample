package com.example.batch.springbatchmanish.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

	@Autowired
	private ActivityRepository12 activityRepository;
	
	public void saveActivity(Activity activity) {
		activityRepository.save(activity);
	}
}
