package com.navishka.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
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
