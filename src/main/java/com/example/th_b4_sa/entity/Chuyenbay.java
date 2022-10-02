package com.example.th_b4_sa.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.time.LocalTime;

@Entity
@Table(name = "chuyenbay", schema = "manhdev")
@AllArgsConstructor@NoArgsConstructor
@Getter@Setter@Builder@ToString
public class Chuyenbay {
	@Id
	@Size(max = 5)
	@Column(name = "MaCB", nullable = false, length = 5)
	private String id;
	
	@Size(max = 50)
	@Column(name = "GaDi", length = 50)
	private String gaDi;
	
	@Size(max = 50)
	@Column(name = "GaDen", length = 50)
	private String gaDen;
	
	@Column(name = "DoDai")
	private Integer doDai;
	
	@Column(name = "GioDi")
	private LocalTime gioDi;
	
	@Column(name = "GioDen")
	private LocalTime gioDen;
	
	@Column(name = "ChiPhi")
	private Integer chiPhi;
	

	
	
}