package com.khaisinh.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="dantoc")
public class DanToc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="madt",nullable=false)
	private int maDanToc;
	
	@Column(name="tendt",nullable=false)
	private String tenDanToc;
	
	@OneToMany(mappedBy = "classDanToc", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	
	@OneToMany(mappedBy = "classDanToc", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;
	
	
	public DanToc() {
		super();
	}


	public DanToc(String tenDanToc, List<ToKhai> listToKhai, List<NhanKhau> listNhanKhau) {
		super();
		this.tenDanToc = tenDanToc;
		this.listToKhai = listToKhai;
		this.listNhanKhau = listNhanKhau;
	}


	public int getMaDanToc() {
		return maDanToc;
	}


	public void setMaDanToc(int maDanToc) {
		this.maDanToc = maDanToc;
	}


	public String getTenDanToc() {
		return tenDanToc;
	}


	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
	}


	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}


	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}


	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}


	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}

	
	
}
