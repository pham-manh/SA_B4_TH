package com.example.th_b4_sa;

import com.example.th_b4_sa.service.AirPlaneServiceImpl;
import com.example.th_b4_sa.service.CertificationImpl;
import com.example.th_b4_sa.service.EmplServiceImpl;
import com.example.th_b4_sa.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ThB4SaApplication implements CommandLineRunner {
	@Autowired
	FlightServiceImpl flightService;
	@Autowired
	AirPlaneServiceImpl airPlaneService;
	@Autowired
	EmplServiceImpl emplService;
	@Autowired
	CertificationImpl certification;
	
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
//		System.out.println("----CÂU 3----");
//		emplService.listSalaryLower(10000).forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 4----");
//		flightService.listFlightPathRangeBetween(10000, 8000).forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 5----");
//		System.out.println(flightService.contBYStartAndEndAirPortName("sgn","bmv"));
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 6----");
//		System.out.println(flightService.contBYStartAirPortName("sgn"));
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 7----");
//		System.out.println(airPlaneService.countHasName("boeing"));
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 8----");
//		System.out.println("Tổng số lương phải trả cho nhân viên là : " + emplService.getTotalSalaryEmployee());
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 9----");
//		certification.getIDPilotBoeing().forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 10----");
//		certification.getIDPilotFlyIDPlane("747").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 11----");
//		airPlaneService.getIDPlanePilotWithFNameFly("nguyen").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 12----");
//		certification.getIDPilotFly("boeing","airbus").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 13----");
//		airPlaneService.getListAirPlaneCanFlyWithFlightID("VN280").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 14----");
//		flightService.getFlightWithAirPlaneName("Airbus A320").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 15----");
//		emplService.getPilotNameWithAirPlaneName("boeing").forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 16---");
//		List<Object[]> objs = emplService.CountPilotWithAirPlaneType();
//		System.out.format("%-15s %-32s %-15s %-15s", "ID", "Name", "FlyRange", "Number Pilot");
//		objs.forEach(objects -> {
//			System.out.format("%-15s %-32s %-15s %-15s", objects[0], objects[1], objects[2], objects[3]);
//			System.out.println();
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 17---");
//		flightService.getFligitCanRoundTrip().forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 18---");
//		List<Object[]> objs = flightService.getNumberFlightByAirPort();
//		
//		System.out.format("%-15s%-3s\n", "AirPort", "Number Fight");
//		objs.forEach(objects -> {
//			System.out.format("%-15s %-3s\n", objects[0], objects[1]);
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 19---");
//		List<Object[]> objs = flightService.getCostByAirport();
//		System.out.format("%-15s%-3s\n", "AirPort", "Cost");
//		objs.forEach(objects -> {
//			System.out.format("%-15s %-3s\n", objects[0], objects[1]);
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 20---");
//		flightService.getFlightDepartureBefore("12:00")
//				.forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 21---");
//		String time = "12:00";
//		List<Object[]> objs = flightService.getNumberFlightDepartureBeforeByAirPort(time);
//		System.out.format("%-15s%-3s\n", "AirPort", "Number Flight Departure Before " + time);
//		objs.forEach(objects -> {
//			System.out.format("%-15s %-3s\n", objects[0], objects[1]);
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 22---");
//		emplService.getIDPilotDrive3TypeAirPlane().forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 23---");
//		List<Object[]> objs = emplService.getPilotFlyGreat3TypeWithRangeFlyMax();
//		System.out.format("%-15s%-8s\n", "ID Pilot", "Max Flight Range ");
//		objs.forEach(objects -> {
//			System.out.format("%-15s%-8s\n", objects[0], objects[1]);
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 24----");
//		List<Object[]> objs = emplService.getNumberTypePilotDrive();
//		System.out.format("%-15s%-8s\n", "ID Pilot", "Number Type Can Drive");
//		objs.forEach(objects -> {
//			System.out.format("%-15s%-8s\n", objects[0], objects[1]);
//		});
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 25----");
//		emplService.getEmplNotAPilot().forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 26----");
//		emplService.getIDEmplHighestSalary().forEach(System.out::println);
//		System.out.println("==========================================================================================");
//		System.out.println("----CÂU 27----");
//		System.out.println("total salary"+emplService.totalSalaryPilot());
		System.out.println("==========================================================================================");
		System.out.println("----CÂU 28----");
		flightService.getFlightCanFlyAllAirPlaneByType("boeing").forEach(System.out::println);
	}
}
