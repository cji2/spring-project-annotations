package edu.gmu.springproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	// field injection.
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define default constructor.
	public TennisCoach() {
		System.out.println("TennisCoach: >> inside default constructor!");
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService aFortuneService) {
		System.out.println("TennisCoach: in an arg constructor!");
		
		fortuneService = aFortuneService;
	} */
	
	// define a setter method. 
	/*
	@Autowired
	public void setFortuneService(FortuneService aFortuneService) {
		System.out.println("TennisCoach: >> inside setFortuneService() method!");
		
		fortuneService = aFortuneService;
	} */

	// define a method
	/*
	@Autowired
	public void doSomeStuff(FortuneService aFortuneService) {
		System.out.println("TennisCoach: in a method!");
		
		fortuneService = aFortuneService;
	} */

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
	}
	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
