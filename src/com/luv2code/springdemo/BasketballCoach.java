package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;

	public BasketballCoach() {
	}
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;	
	}

	@Override
	public String getDailyWorkout() {
		return "Do 50 free throws";
	}

	@Override
	public String getDailyFortune() {
		return "Ball is life! " + fortuneService.getFortune();
	}

}
