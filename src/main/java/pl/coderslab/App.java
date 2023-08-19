package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;
import pl.coderslab.config.ApplicationConfig;

/**
 * Hello world!
 */

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		helloWorld.hello();

		Ship ship = context.getBean("blackPearl", Ship.class);
		ship.captain.startSailing();

		context.close();
	}
}
