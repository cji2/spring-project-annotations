package edu.gmu.springproj;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("TennisCoach: in no-arg constructor!");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
	}
}
