package com.calendar.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SchedulerApplication {

	/**
	 * The main run method
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}

}
