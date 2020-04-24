package com.navishka.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Bat for 30 minutes";
	}

}
