package com.abdul.models;

import org.springframework.beans.factory.DisposableBean;

import com.abdul.interfaces.Person;

public class Employee implements Person, DisposableBean{
	
	
	private HappyMoodService happyMoodService;
	private Integer empId;
	private String empName;
	
	
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee() {
		super();
	}

	public Employee(HappyMoodService myMoodIsHappy) {
		happyMoodService = myMoodIsHappy;
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
	
	public void login() {
		System.out.println("Hey there, Keep up the good work!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Goodbye, See you soon!");
	}

}
