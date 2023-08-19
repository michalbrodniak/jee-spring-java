package pl.coderslab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.Captain;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;

@Configuration
public class ApplicationConfig {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}

	@Bean
	public Ship blackPearl(){
		return new Ship(jackSparrow());
	}

	@Bean
	public Captain jackSparrow(){
		return new Captain();
	}
}
