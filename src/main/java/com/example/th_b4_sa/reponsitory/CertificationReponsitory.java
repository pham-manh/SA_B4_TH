package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Chungnhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificationReponsitory extends JpaRepository<Chungnhan, Long> {
	
	@Query(value = "select distinct nhanvien.MaNV from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner JOIN nhanvien on nhanvien.MaNV = chungnhan.MaNV " +
			"where Loai like '%boeing%'"
			, nativeQuery = true)
	public List<?> getIDPilotBoeing ();
	
	@Query(value = "select distinct nhanvien.MaNV from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner JOIN nhanvien on nhanvien.MaNV = chungnhan.MaNV where maybay.MaMB like upper(concat('%',?1,'%'))"
			, nativeQuery = true)
	List<?> getIDPilotFlyIDPlane (String id);
	
	@Query(value = "select distinct nhanvien.MaNV from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner join nhanvien  on chungnhan.MaNV = nhanvien.MaNV " +
			"where Loai like  upper(concat('%',?1,'%')) " +
			"or Loai like upper(concat('%',?2,'%'))",nativeQuery = true)
	List<?> getIDPilotFly(String name1,String name2);
}
