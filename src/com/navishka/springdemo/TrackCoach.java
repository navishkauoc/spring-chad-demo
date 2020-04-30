package com.navishka.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it. "+ fortuneService.getFortune();
	}

}
