package com.navishka.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Ball for 15mins";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
