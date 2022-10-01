package com.example.th_b4_sa.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChungnhanId implements Serializable {
	private static final long serialVersionUID = 8748536950708762464L;
	@Size(max = 9)
	@NotNull
	@Column(name = "MaNV", nullable = false, length = 9)
	private String maNV;
	
	@NotNull
	@Column(name = "MaMB", nullable = false)
	private Integer maMB;
	
	public String getMaNV () {
		return maNV;
	}
	
	public void setMaNV (String maNV) {
		this.maNV = maNV;
	}
	
	public Integer getMaMB () {
		return maMB;
	}
	
	public void setMaMB (Integer maMB) {
		this.maMB = maMB;
	}
	
	@Override
	public boolean equals (Object o) {
		if(this == o) return true;
		if(o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		ChungnhanId entity = (ChungnhanId) o;
		return Objects.equals(this.maMB, entity.maMB) &&
				Objects.equals(this.maNV, entity.maNV);
	}
	
	@Override
	public int hashCode () {
		return Objects.hash(maMB, maNV);
	}
	
}