package com.example.th_b4_sa;

import com.example.th_b4_sa.service.AirPlaneServiceImpl;
import com.example.th_b4_sa.service.EmplServiceImpl;
import com.example.th_b4_sa.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThB4SaApplication implements CommandLineRunner {
	@Autowired
	FlightServiceImpl flightService;
	@Autowired
	AirPlaneServiceImpl airPlaneService;
	
	@Autowired
	EmplServiceImpl emplService;
	
	public static void main (String[] args) {
		SpringApplication.run(ThB4SaApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception {
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 1----");
//		flightService.listFlightEndByName("DLI").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 2----");
//		airPlaneService.listFlyRangeGreater(10000).forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 3---");
//		emplService.listSalaryLower(10000).forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 4---");
//		flightService.listFlightPathRangeBeetwen(10000,8000).forEach(System.out::println);
		System.out.println("==========================================================================================");
		System.out.println("----CÂU 5---");
		System.out.println(flightService.contBYStartAndEndAirPortName("sgn","bmv"));
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 6---");
//		System.out.println(flightService.contBYStartAirPortName("sgn"));
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 7 ---");
	}
}
