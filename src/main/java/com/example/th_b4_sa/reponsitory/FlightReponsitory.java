package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.ChungnhanId;
import com.example.th_b4_sa.entity.Chuyenbay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightReponsitory extends JpaRepository<Chuyenbay,Long> {

	@Query(value = "SELECT * from chuyenbay where GaDen like ?1",nativeQuery = true)
	public List<Chuyenbay> listFlightEndByName(String name); //1
	
}
