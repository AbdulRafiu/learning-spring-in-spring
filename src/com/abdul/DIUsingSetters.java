package com.abdul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abdul.interfaces.Person;
import com.abdul.models.UnEmployed;

public class DIUsingSetters {

	public static void main(String[] args) {
		
		// Initializing the Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieving the wanted bean
		Person unemployed = context.getBean("unemployed", UnEmployed.class);
		
		// Calling the SadMoodServices' method which in injected
		// into person object using Setters
		unemployed.eats();
		System.out.println(unemployed.getMood());
		
		// Closing the context to prevent any leaks, piss, oops!
		context.close();
		
	}

}
