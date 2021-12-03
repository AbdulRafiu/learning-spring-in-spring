package com.abdul;

public class Employee implements Person{
	
	
	private HappyMoodService happyMoodService;
	
	public Employee() {
		super();
	}

	public Employee(HappyMoodService myMood) {
		happyMoodService = myMood;
	}

	@Override
	public void eats() {
		System.out.println("I ate a Mango, Keep shitting!");	
	}

	@Override
	public String talks() {
		return "I can't talk!";
	}

	@Override
	public boolean isAsleep() {
		return false;
	}

	@Override
	public String getMood() {
		return happyMoodService.getMood();
	}

}
