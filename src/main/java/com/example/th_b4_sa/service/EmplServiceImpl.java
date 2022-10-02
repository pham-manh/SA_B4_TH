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
	
	public List<Nhanvien> listSalaryLower (int maxSalary){
		return employeeReponsitpry.listSalaryLower(maxSalary);
	}
}
