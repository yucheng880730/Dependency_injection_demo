package com.example.DependencyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);
		// tell the compiler to return an object of the customers class
		Customers c = context.getBean(Customers.class);
		c.display();
	}

}
