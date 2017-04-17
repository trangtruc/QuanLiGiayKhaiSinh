package com.khaisinh.domain;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="giaykhaisinh")
public class GiayKhaiSinh {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="soks",nullable=false)
	private int soKhaiSinh;
	
	@Column(name="ngaycap",nullable=false)
	private Date ngayCap;
	
	@Column(name="ghichu",nullable=false)
	private String ghiChu;
	
	
	
	@ManyToOne
	@JoinColumn(name="giayks_tokhai_id")
	private ToKhai classToKhai;
	
	
	
	public GiayKhaiSinh() {
		super();
	}

	

	public GiayKhaiSinh(Date ngayCap, String ghiChu, ToKhai classToKhai) {
		super();
		this.ngayCap = ngayCap;
		this.ghiChu = ghiChu;
		this.classToKhai = classToKhai;
	}



	public int getSoKhaiSinh() {
		return soKhaiSinh;
	}

	public void setSoKhaiSinh(int soKhaiSinh) {
		this.soKhaiSinh = soKhaiSinh;
	}

	public Date getNgayCap() {
		return ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public ToKhai getClassToKhai() {
		return classToKhai;
	}

	public void setClassToKhai(ToKhai classToKhai) {
		this.classToKhai = classToKhai;
	}

	
}
