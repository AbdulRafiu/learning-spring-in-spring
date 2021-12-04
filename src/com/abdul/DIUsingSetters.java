package com.abdul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abdul.interfaces.Person;
import com.abdul.models.UnEmployed;

public class DIUsingSetters {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person unemployed = context.getBean("unemployed", UnEmployed.class);
		
		System.out.println(unemployed.getMood());
	}

}
