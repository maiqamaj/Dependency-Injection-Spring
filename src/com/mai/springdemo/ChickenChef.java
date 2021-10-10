package com.mai.springdemo;

public class ChickenChef implements Chef {

	// define a private field for the dependency
	private FreeService freeService;

	public ChickenChef() {

	}

	// define a constructor for dependency injection
	public ChickenChef(FreeService theService) {
		freeService = theService;
	}


	@Override
	public String getMeal() {
		// TODO Auto-generated method stub
		return "Get Chicken meal";
	}

	@Override
	public String getFreeDrink() {
		
		 return freeService.getFree();
	}
}
