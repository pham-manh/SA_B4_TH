package com.example.th_b4_sa;

import com.example.th_b4_sa.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThB4SaApplication implements CommandLineRunner {
	@Autowired
	FlightServiceImpl flightService;
	
	public static void main (String[] args) {
		SpringApplication.run(ThB4SaApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception {
		System.out.println("==========================================================================================");
		
		
		flightService.listFlightEndByName("DLI").forEach(System.out::println);
	}
}
