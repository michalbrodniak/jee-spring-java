package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.config.ApplicationConfig;

/**
 * Hello world!
 */

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		helloWorld.localDateAndTime();


		context.close();
	}
}
