package com.example.th_b4_sa.service;

import com.example.th_b4_sa.reponsitory.CertificationReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CertificationImpl{
	
	@Autowired
	private CertificationReponsitory certificationReponsitory;
	
	public List<?> getIDPilotBoeing (){
		return certificationReponsitory.getIDPilotBoeing();
	}
	
	
}
