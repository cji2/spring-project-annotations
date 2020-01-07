package edu.gmu.springproj;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
	
	public SwimmingCoach() {
		System.out.println("SwimmingCoach: in no-arg constructor!");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your free-style stroke!";
	}
}
