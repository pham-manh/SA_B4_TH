package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Chuyenbay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightReponsitory extends JpaRepository<Chuyenbay, String> {
	
	@Query(value = "SELECT * from chuyenbay where GaDen like ?1", nativeQuery = true)
	public List<Chuyenbay> listFlightEndByName (String name); //1
	
	@Query(value = "select * from chuyenbay where DoDai between ?2 and ?1", nativeQuery = true)
	public List<Chuyenbay> listFlightPathRangeBetween (int maxRange, int minRange); //4
	
	@Query(value = "select COUNT(*) from chuyenbay where GaDi like ?1 and GaDen like ?2", nativeQuery = true)
	public int contBYStartAndEndAirPortName (String start, String end);
	
	@Query(value = "select COUNT(*) from chuyenbay where GaDi like ?1", nativeQuery = true)
	public int contBYStartAirPortName (String start);
	
	@Query(value = "select * from chuyenbay where DoDai < (select TamBay from maybay where Loai like ? )"
			, nativeQuery = true)
	public List<Chuyenbay> getFlightWithAirPlaneName (String name); //c15
	
	@Query(value = "select distinct chuyenbay.* from chuyenbay " +
			"inner join maybay " +
			"where maybay.TamBay > (chuyenbay.DoDai * 2)"
			, nativeQuery = true)
	public List<Chuyenbay> getFligitCanRoundTrip ();
	
	@Query(value = "select  GaDi,count(GaDi) from chuyenbay group by GaDi", nativeQuery = true)
	public List<Object[]> getNumberFlightByAirPort ();
	
	@Query(value = "select GaDi, sum(ChiPhi) from chuyenbay group by GaDi", nativeQuery = true)
	public List<Object[]> getCostByAirport ();
	
	@Query(value = "select * from chuyenbay where GioDi < ?1",nativeQuery = true)
	public List<Chuyenbay> getFlightDepartureBefore(String time);
	@Query(value = "select chuyenbay.GaDi,count(GaDi) from chuyenbay where GioDi < ?1 group by GaDi",nativeQuery = true)
	public List<Object[]> getNumberFlightDepartureBeforeByAirPort(String time);
}