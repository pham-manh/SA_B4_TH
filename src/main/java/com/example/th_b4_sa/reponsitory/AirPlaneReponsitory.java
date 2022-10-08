package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Maybay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirPlaneReponsitory extends JpaRepository<Maybay, Integer> {
	
	@Query(value = "select * from maybay where TamBay > ?1", nativeQuery = true)
	public List<Maybay> listFlyRangeGreater (int minRange);
	
	@Query(value = "select count(distinct(Loai))from maybay where Loai like upper(concat('%',?1,'%'))", nativeQuery = true)
	public int countHasName (String name);
	
}
