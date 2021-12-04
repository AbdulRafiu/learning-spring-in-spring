package com.abdul.models;

import com.abdul.interfaces.Person;

public class UnEmployed implements Person {
	
	SadMoodService sadMoodService;

	public UnEmployed() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSadMoodService(SadMoodService myMoodIsSad) {
		sadMoodService = myMoodIsSad;
	}

	@Override
	public void eats() {
		System.out.println("Eating on someone else's money!");		
	}

	@Override
	public String talks() {
		return "Talks but slowly";
	}

	@Override
	public boolean isAsleep() {
		return true;
	}

	@Override
	public String getMood() {
		return sadMoodService.getMood();
	}

}
