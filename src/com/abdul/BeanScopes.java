package com.abdul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abdul.interfaces.Person;
import com.abdul.models.Employee;
import com.abdul.models.UnEmployed;

public class BeanScopes {

	public static void main(String[] args) throws Exception {
				
		// Initializing the Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieving the bean with scope 'prototype'
		// Bean Initialization methods will also be called
		Person employed1 = context.getBean("employed", Employee.class);
		Person employed2 = context.getBean("employed", Employee.class);
		
		// Retrieving the bean with scope 'singleton'
		Person unemployed1 = context.getBean("unemployed", UnEmployed.class);
		Person unemployed2 = context.getBean("unemployed", UnEmployed.class);
		
		// Printing the instances and seeing the difference
		System.out.println();
		System.out.println("Employed1 Bean: " + employed1 + " and Employeed2 Bean: " + employed2);
		System.out.println("Are Equal? " + (employed1 == employed2));
		System.out.println("Unemployed1 Bean: " + unemployed1 + " and Unemployed2 Bean: " + unemployed2);
		System.out.println("Are Equal? " + (unemployed1 == unemployed2));
		System.out.println();
		
		// Closing the context to prevent any leaks, piss, oops!
		// Bean Destruction methods will also be called
		context.close();
		
	}

}
