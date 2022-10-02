package com.example.th_b4_sa.service;

import com.example.th_b4_sa.entity.Maybay;
import com.example.th_b4_sa.reponsitory.AirPlaneReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirPlaneServiceImpl {
	@Autowired
	AirPlaneReponsitory airPlaneReponsitory;
	
	public List<Maybay> listFlyRangeGreater (int minRange) {
		return airPlaneReponsitory.listFlyRangeGreater(minRange);
	}
}
