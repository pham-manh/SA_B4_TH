package com.example.th_b4_sa.entity;

import javax.persistence.*;

@Entity
@Table(name = "chungnhan", schema = "manhdev")
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