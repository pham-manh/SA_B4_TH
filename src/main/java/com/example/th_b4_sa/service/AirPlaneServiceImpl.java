package com.example.th_b4_sa.service;

import com.example.th_b4_sa.entity.Maybay;
import com.example.th_b4_sa.reponsitory.AirPlaneReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class AirPlaneServiceImpl {
	@Autowired
	AirPlaneReponsitory airPlaneReponsitory;
	
	public List<Maybay> listFlyRangeGreater (int minRange) {
		return airPlaneReponsitory.listFlyRangeGreater(minRange);
	}
	
	public String countHasName(String name){
		return "There are "+airPlaneReponsitory.countHasName(name)+
				" types of aircraft named "+name.toUpperCase(Locale.ROOT);
	}
	
	public List<?> getIDPlanePilotWithFNameFly (String name) {
		return airPlaneReponsitory.getIDPlanePilotWithFNameFly (name);
	}
	
	public List<?> getListAirPlaneCanFlyWithFlightID(String FlightID){
		return airPlaneReponsitory.getListAirPlaneCanFlyWithFlightID(FlightID);
	}
	
	
}
