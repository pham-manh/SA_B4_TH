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
@Table(name = "nhanvien")
public class Nhanvien {
	@Id
	@Size(max = 9)
	@Column(name = "MaNV", nullable = false, length = 9)
	private String id;
	
	@Size(max = 50)
	@Column(name = "Ten", length = 50)
	private String ten;
	
	@Column(name = "Luong")
	private Integer luong;
	

}