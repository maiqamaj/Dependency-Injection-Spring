package com.mai.springdemo;

public class FastFoodChef implements Chef {
	private FreeService freeService;
	private String email;
	private String name;

	public void setEmail(String email) {
		System.out.println("FastFoodChef : inside setter method - setEmailAddress");

		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("FastFoodChef : inside setter method - setTeam");

		this.name = name;
	}

	public FastFoodChef() {
		System.out.println("FastFoodChef : inside no-arg constructor");
	}

	// setter method
	public void setFreeService(FreeService freeService) {
		System.out.println("FastFoodChef : inside setter method - setFortuneService");
		this.freeService = freeService;
	}


	@Override
	public String getMeal() {
		// TODO Auto-generated method stub
		return "Get Fast Food ";
	}

	@Override
	public String getFreeDrink() {
		// TODO Auto-generated method stub
		return freeService.getFree();
	}

}
