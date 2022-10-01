package com.example.th_b4_sa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "maybay")
public class Maybay {
	@Id
	@Column(name = "MaMB", nullable = false)
	private Integer id;
	
	@Size(max = 50)
	@Column(name = "Loai", length = 50)
	private String loai;
	
	@Column(name = "TamBay")
	private Integer tamBay;
	
	
	
}