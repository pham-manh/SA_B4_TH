package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeReponsitpry extends JpaRepository<Nhanvien, Long> {
	
	@Query(value = "select * from Nhanvien where Luong < ?1", nativeQuery = true)
	public List<Nhanvien> listSalaryLower (int maxSalary);
	
	@Query(value = "select sum(Nhanvien .luong) from Nhanvien ", nativeQuery = true)
	public double getTotalSalaryEmployee ();
	
	@Query(value = "select  distinct nhanvien.Ten from chungnhan " +
			"inner JOIN maybay  on chungnhan.MaMB = maybay.MaMB " +
			"inner JOIN nhanvien  on chungnhan.MaNV = nhanvien.MaNV where Loai like concat('%',?1,'%')", nativeQuery = true)
	public List<String> getPilotNameWithAirPlaneName (String airPlaneName);
	
	@Query(value = "select maybay.MaMB, maybay.Loai, maybay.TamBay, count(distinct nhanvien.MaNV) as soluongphiconglai " +
			"from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien on chungnhan.MaNV = nhanvien.MaNV " +
			"group by maybay.MaMB", nativeQuery = true)
	public List<Object[]> CountPilotWithAirPlaneType (); //c16
	
	@Query(value = "select nhanvien.MaNV from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien on chungnhan.MaNV = nhanvien.MaNV " +
			"group by nhanvien.MaNV " +
			"having count(maybay.MaMB) = 3", nativeQuery = true)
	public List<String> getIDPilotDrive3TypeAirPlane ();
	
	@Query(value = "select nhanvien.MaNV , max(maybay.TamBay) as MaxFlyRange from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien on chungnhan.MaNV = nhanvien.MaNV " +
			"group by nhanvien.MaNV having count(maybay.MaMB) > 3", nativeQuery = true)
	public List<Object[]> getPilotFlyGreat3TypeWithRangeFlyMax ();
	
	@Query(value = "select nhanvien.MaNV ,count(maybay.MaMB) as TypeAirPlaneHaveDrive from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien on chungnhan.MaNV = nhanvien.MaNV " +
			"group by nhanvien.MaNV " +
			"order by count(maybay.MaMB) desc", nativeQuery = true)
	public List<Object[]> getNumberTypePilotDrive ();
	
	@Query(value = "select * from nhanvien where MaNV not in (select MaNV from chungnhan)",nativeQuery = true)
	public List<Nhanvien> getEmplNotAPilot(); //c25
	
	@Query(value ="select * from nhanvien where Luong=(select max(Luong) from nhanvien)", nativeQuery = true)
	public List<String> getIDEmplHighestSalary(); //26
	
	@Query(value = "select sum(Luong )from nhanvien where MaNV in (select MaNV from chungnhan)",nativeQuery = true)
	public List<String> totalSalaryPilot();
}
