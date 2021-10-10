package com.mai.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		FastFoodChef chef = context.getBean("myFastFoodChef", FastFoodChef.class);

		// call method on the bean

		
		System.out.println(chef.getName());
		System.out.println(chef.getEmail());
		System.out.println(chef.getMeal());
		System.out.println(chef.getFreeDrink());
		// close context
		context.close();

	}

}
