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
	public List<Chuyenbay> listFlightPathRangeBeetwen (int maxRange, int minRange); //4
	
	@Query(value = "select COUNT(*) from chuyenbay where GaDi like ?1 and GaDen like ?2",nativeQuery = true)
	public int contBYStartAndEndAirPortName(String start,String end);
	
	@Query(value = "select COUNT(*) from chuyenbay where GaDi like ?1",nativeQuery = true)
	public int contBYStartAirPortName(String start);
	
}
