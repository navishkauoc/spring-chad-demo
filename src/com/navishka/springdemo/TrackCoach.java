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
	
	//Adding an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff method");
	}
	
	//Adding a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff method");
	}

}
