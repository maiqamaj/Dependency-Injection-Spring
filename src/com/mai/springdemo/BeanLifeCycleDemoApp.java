package com.mai.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");
		// retrieve bean from spring container
		Chef chef = context.getBean("myChef", Chef.class);

		System.out.println(chef.getMeal());

		context.close();

	}

}
