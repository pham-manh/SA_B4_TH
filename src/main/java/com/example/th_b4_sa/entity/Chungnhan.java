package com.example.th_b4_sa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chungnhan")
public class Chungnhan {
	@EmbeddedId
	private ChungnhanId id;
	
	@MapsId("maNV")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MaNV", nullable = false)
	private Nhanvien maNV;
	
	@MapsId("maMB")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MaMB", nullable = false)
	private Maybay maMB;
	
	
}