package edu.gmu.springproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SwimmingCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	@Value("${gmu.email}")
	private String email;
	
	@Value("${gmu.team}")
	private String team;
	
	public SwimmingCoach() {
		System.out.println("SwimmingCoach: in no-arg constructor!");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your free-style stroke!";
	}
	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
