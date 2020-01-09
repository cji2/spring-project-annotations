package edu.gmu.springproj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIByAnnotationApp {

	public static void main(String[] args) {
		
		// create a spring container: load the Spring configuration file.
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* retrieve bean from spring container.
		   'pinpongCoach' is bean id. 'Coach.class' is interface. */
		Coach aCoach = context.getBean("pingpongCoach", Coach.class);
		
		// call methods on the bean.
		System.out.println(aCoach.getDailyWorkout());
		System.out.println(aCoach.getDailyFortune());
		
		// close the application context.
		context.close();
	}
}
