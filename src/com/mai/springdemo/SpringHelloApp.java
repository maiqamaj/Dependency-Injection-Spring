package com.mai.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Chef theChef = context.getBean("myChef", Chef.class);
		
		// call methods on the bean
		System.out.println(theChef.getFreeDrink());
		
		// let's call our new method for fortunes
		System.out.println(theChef.getMeal());
		
		// close the context
		context.close();
	}

}







