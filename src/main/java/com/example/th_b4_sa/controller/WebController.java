//package com.example.th_b4_sa.controller;
//
//import com.example.th_b4_sa.entity.Chuyenbay;
//import com.example.th_b4_sa.entity.Maybay;
//import com.example.th_b4_sa.service.AirPlaneServiceImpl;
//import com.example.th_b4_sa.service.FlightServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class WebController {
//	@Autowired
//	FlightServiceImpl flightService;
//	@Autowired
//	AirPlaneServiceImpl airPlaneService;
//
//	@GetMapping(value = "/search/ques1", params = "name")
//	public List<?> listFlightEndByName (@RequestParam String name) {
//		List<Chuyenbay> listFound = flightService.listFlightEndByName(name);
//		return listFound;
//	}
//
//	@GetMapping(value = "/search/ques2", params = "min_range")
//	public List<?> listFlyRangeGreater (@RequestParam int min_range) {
//		List<Maybay> listFound = airPlaneService.listFlyRangeGreater(min_range);
//		return listFound;
//	}
//
//}
