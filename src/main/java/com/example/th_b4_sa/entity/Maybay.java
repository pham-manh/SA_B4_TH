package com.example.th_b4_sa.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity

@AllArgsConstructor@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "maybay", schema = "manhdev")
public class Maybay {
	@Id
	@Column(name = "MaMB", nullable = false)
	private Integer id;
	
	@Size(max = 50)
	@Column(name = "Loai", length = 50)
	private String loai;
	
	@Column(name = "TamBay")
	private Integer tamBay;
	
	@ManyToMany
	@JoinTable(name = "chungnhan",
			joinColumns = @JoinColumn(name = "MaMB"),
			inverseJoinColumns = @JoinColumn(name = "MaNV"))
	@ToString.Exclude
	private Set<Nhanvien> nhanviens = new LinkedHashSet<>();
	public Integer getId () {
		return id;
	}
	
	
}