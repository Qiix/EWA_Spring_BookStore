package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration

@SpringBootApplication
public class PartSiwarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartSiwarApplication.class, args);
	}

}
