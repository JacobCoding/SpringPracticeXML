package com.luv2code.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public GolfCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice hitting ball skills for 1hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
