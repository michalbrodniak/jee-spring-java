package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.config.ApplicationConfig;

/**
 * Hello world!
 */

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		helloWorld.hello();

		context.close();
	}
}
