package com.example.th_b4_sa.service;

import com.example.th_b4_sa.entity.Nhanvien;
import com.example.th_b4_sa.reponsitory.EmployeeReponsitpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplServiceImpl {
	@Autowired
	EmployeeReponsitpry employeeReponsitpry;
	
	public List<Nhanvien> listSalaryLower (int maxSalary) {
		return employeeReponsitpry.listSalaryLower(maxSalary);
	}
	
	public Double getTotalSalaryEmployee () {
		return employeeReponsitpry.getTotalSalaryEmployee();
	}
	
	public List<String> getPilotNameWithAirPlaneName (String airPlaneName) {
		return employeeReponsitpry.getPilotNameWithAirPlaneName(airPlaneName);
	}
	
	public List<Object[]> CountPilotWithAirPlaneType () {
		return employeeReponsitpry.CountPilotWithAirPlaneType();
	}
	
	public List<String> getIDPilotDrive3TypeAirPlane () {
		return employeeReponsitpry.getIDPilotDrive3TypeAirPlane();
	}
	
	;
	
	public List<Object[]> getPilotFlyGreat3TypeWithRangeFlyMax () {
		return employeeReponsitpry.getPilotFlyGreat3TypeWithRangeFlyMax();
	}
	
	;
	
	public List<Object[]> getNumberTypePilotDrive () {
		return employeeReponsitpry.getNumberTypePilotDrive();
	}
	
	;
	
	public List<Nhanvien> getEmplNotAPilot () {
		return employeeReponsitpry.getEmplNotAPilot();
	}
	
	;
	
	public List<String> getIDEmplHighestSalary () {
		return employeeReponsitpry.getIDEmplHighestSalary();
	}
	
	;
	
	public List<String> totalSalaryPilot () {
		return employeeReponsitpry.totalSalaryPilot();
	};
	
	
	
}
