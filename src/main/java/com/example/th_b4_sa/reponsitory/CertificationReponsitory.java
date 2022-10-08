package com.example.th_b4_sa.reponsitory;

import com.example.th_b4_sa.entity.Chungnhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Repository
public interface CertificationReponsitory extends JpaRepository<Chungnhan, Long> {
	
	@Query(value = "select nhanvien.MaNV from chungnhan " +
			"inner join maybay on chungnhan.MaMB = maybay.MaMB " +
			"inner JOIN nhanvien on nhanvien.MaNV = chungnhan.MaNV " +
			"where Loai like '%boeing%'"
			, nativeQuery = true)
	public List<?> getIDPilotBoeing ();
}
