package com.abdul.models;

import com.abdul.interfaces.MoodService;

public class SadMoodService implements MoodService {

	@Override
	public String getMood() {
		
		return "I need a job, can you?\nThat's why sadness overcomes my feelings";
		
	}

}
