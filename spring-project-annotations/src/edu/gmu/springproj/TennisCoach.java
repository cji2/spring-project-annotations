package edu.gmu.springproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: in no-arg constructor!");
	}
	
	@Autowired
	public TennisCoach(FortuneService aFortuneService) {
		System.out.println("TennisCoach: in an arg constructor!");
		
		fortuneService = aFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
	}
	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
