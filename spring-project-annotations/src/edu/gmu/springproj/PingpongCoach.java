package edu.gmu.springproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PingpongCoach implements Coach {
	
	@Autowired
	@Qualifier("fileRandomFortuneService")
	FortuneService fortuneService;
	
	public PingpongCoach() {
		System.out.println("PingpongCoach: inside default constructor!");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your pingpong drop shot!";
	}
	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
