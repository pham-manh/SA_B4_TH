package com.example.th_b4_sa.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "nhanvien", schema = "manhdev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
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
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "chungnhan",
			joinColumns = @JoinColumn(name = "MaNV"),
			inverseJoinColumns = @JoinColumn(name = "MaMB"))
	private Set<Maybay> maybays = new LinkedHashSet<>();
	
}