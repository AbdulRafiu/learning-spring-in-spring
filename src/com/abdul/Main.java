package com.abdul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Initializing the Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieving the wanted Bean -- IOC
		Person person = context.getBean("person", Employee.class);
		
		// Initializing the employee object using traditional way
		Person person2 = new Employee();
		
		// Initializing the employee object using IOC way -- oh! sounds fancy!
		// Person person2 = context.getBean("person", Employee.class);
		
		// Accessing Beans' objects
		
		// The object created without DI -- person2
		System.out.println(person2.talks());
		person.eats();
		System.out.println(person2.talks());
		System.out.println(person2.isAsleep());
		// Calling getMood on person2 withh produce an error!
		// Dare to uncomment the next line??? you are welcome!
		// System.out.println(person2.getMood());
		try {
			System.out.println(person2.getMood());
		} catch (NullPointerException ne) {
			ne.printStackTrace();
			System.out.println("Use Dependency Injection, you moron!");
		}
		 
		// The object created with DI -- person
		person.eats();
		System.out.println(person.talks());
		System.out.println(person.isAsleep());
		System.out.println(person.getMood());
		
		//Closing the context
		context.close();
		
	}

}
