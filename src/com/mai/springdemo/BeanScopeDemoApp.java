package com.mai.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Chef chef = context.getBean("myChef", Chef.class);

		Chef chef2 = context.getBean("myChef", Chef.class);
		// prototype scope bean -- create new object for each request --
		boolean result = chef == chef2;
		System.out.println("Is Objects ate same : " + result);
		System.out.println("Memory location for chef" + chef);
		System.out.println("Memory location for chef2" + chef2);
	}

}
