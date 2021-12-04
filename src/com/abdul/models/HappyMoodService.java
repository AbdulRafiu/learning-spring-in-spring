package com.abdul.models;

import com.abdul.interfaces.MoodService;

public class HappyMoodService implements MoodService {

	@Override
	public String getMood() {
		
		return "Wooha!, I am happy! (Fake smile bro)\nFor Teamwork";
		
	}

}
