package com.study.learnspringframework;

import com.study.learnspringframework.game._3looselyCoupledUsingSpringLooseCouplingLevel2.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}
}