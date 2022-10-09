package com.example.th_b4_sa.service;

import com.example.th_b4_sa.entity.Chuyenbay;
import com.example.th_b4_sa.reponsitory.FlightReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Service
public class FlightServiceImpl {
	
	@Autowired
	private FlightReponsitory flightReponsitory;
	
	public List<Chuyenbay> listFlightEndByName (String name) {
		return flightReponsitory.listFlightEndByName(name);
	}
	
	public List<Chuyenbay> listFlightPathRangeBetween (int maxRange, int minRange) {
		return flightReponsitory.listFlightPathRangeBetween(maxRange, minRange);
	}
	
	public String contBYStartAndEndAirPortName (String start, String end) {
		return "There are " + flightReponsitory.contBYStartAndEndAirPortName(start, end)
				+ " flights from " + start.toUpperCase(Locale.ROOT) + " to " + end.toUpperCase(Locale.ROOT);
	}
	
	public String contBYStartAirPortName (String start) {
		return "There are " + flightReponsitory.contBYStartAirPortName(start)
				+ " flights from " + start.toUpperCase(Locale.ROOT);
	}
	
	public List<?> getFlightWithAirPlaneName (String name) {
		return flightReponsitory.getFlightWithAirPlaneName(name);
	}
	
	public List<Chuyenbay> getFligitCanRoundTrip(){
		return flightReponsitory.getFligitCanRoundTrip();
	};
	
	public List<Object[]> getNumberFlightByAirPort(){
		return flightReponsitory.getNumberFlightByAirPort();
	};
	
	
	public List<Object[]> getCostByAirport (){
		return flightReponsitory.getCostByAirport();
	}
	
	public List<Chuyenbay> getFlightDepartureBefore(String time){
		return flightReponsitory.getFlightDepartureBefore(time);
	}
	public List<Object[]> getNumberFlightDepartureBeforeByAirPort(String time){
		return flightReponsitory.getNumberFlightDepartureBeforeByAirPort(time);
	};
}
