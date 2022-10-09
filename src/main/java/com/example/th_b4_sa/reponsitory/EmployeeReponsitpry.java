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
	
	@Query(value = "select sum(Nhanvien .luong) from Nhanvien ",nativeQuery = true)
	public double getTotalSalaryEmployee();
	
	@Query(value = "select  distinct nhanvien.Ten from chungnhan " +
			"inner JOIN maybay  on chungnhan.MaMB = maybay.MaMB " +
			"inner JOIN nhanvien  on chungnhan.MaNV = nhanvien.MaNV where Loai like concat('%',?1,'%')",nativeQuery = true)
	public List<String> getPilotNameWithAirPlaneName(String airPlaneName);
	
	
	@Query(value = "select maybay.MaMB, maybay.Loai, maybay.TamBay, count(distinct nhanvien.MaNV) as soluongphiconglai " +
			"from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien on chungnhan.MaNV = nhanvien.MaNV " +
			"group by maybay.MaMB",nativeQuery = true)
	public List<Object[]> CountPilotWithAirPlaneType(); //c16
	
}
