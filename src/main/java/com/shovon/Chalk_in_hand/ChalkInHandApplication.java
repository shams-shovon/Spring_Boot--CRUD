package com.shovon.Chalk_in_hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shovon.Chalk_in_hand_sub1.SpringComponent;

@SpringBootApplication
public class ChalkInHandApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ApplicationContext = SpringApplication.run(ChalkInHandApplication.class, args);
		SpringComponent Component = ApplicationContext.getBean(SpringComponent.class);
		System.out.println(Component.GetMessage());
	}

}
