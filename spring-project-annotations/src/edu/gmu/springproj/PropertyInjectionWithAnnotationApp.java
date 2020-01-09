package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInjectionWithAnnotationApp {

	public static void main(String[] args) {
		
		/* create a spring container
		  : load the Spring configuration file. */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* retrieve bean from spring container.
		   'tennisCoach' is bean id. 'Coach.class' is interface. */
		SwimmingCoach aCoach = context.getBean("swimmingCoach", SwimmingCoach.class);
		
		// call methods on the bean.
		System.out.println(aCoach.getDailyWorkout());
		System.out.println(aCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("email: " + aCoach.getEmail());
		System.out.println("team: " + aCoach.getTeam());
		
		// close the application context.
		context.close();
	}
}
