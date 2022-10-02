package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeReponsitpry extends JpaRepository<Nhanvien, String> {
	
	@Query(value = "select * from Nhanvien where Luong < ?1", nativeQuery = true)
	public List<Nhanvien> listSalaryLower (int maxSalary);
}
