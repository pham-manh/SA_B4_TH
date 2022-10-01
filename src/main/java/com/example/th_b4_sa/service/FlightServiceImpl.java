package com.example.th_b4_sa.service;

import com.example.th_b4_sa.entity.Chungnhan;
import com.example.th_b4_sa.entity.Chuyenbay;
import com.example.th_b4_sa.reponsitory.FlightReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl {
	
	@Autowired
	private FlightReponsitory flightReponsitory;
	
	public List<Chuyenbay> listFlightEndByName(String name){
		return flightReponsitory.listFlightEndByName(name);
	}
}
