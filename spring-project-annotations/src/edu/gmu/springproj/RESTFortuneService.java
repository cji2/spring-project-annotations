package edu.gmu.springproj;

import org.springframework.stereotype.Component;

// the following annotation will make Spring register it.
@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Fortune from REST!";
	}

}
