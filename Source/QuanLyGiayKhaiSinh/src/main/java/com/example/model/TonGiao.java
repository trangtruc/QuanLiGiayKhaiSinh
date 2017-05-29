package com.example.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tongiao")
public class TonGiao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="matongiao",nullable=false)	
	private int maTonGiao;
	
	@Column(name="tentongiao",nullable=false)
	private String tenTonGiao;
	
	@OneToMany(mappedBy = "classTonGiao", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	@OneToMany(mappedBy = "classTonGiao2", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;

	public TonGiao() {
		super();
	}

	public TonGiao(String tenTonGiao, List<ToKhai> listToKhai, List<NhanKhau> listNhanKhau) {
		super();
		this.tenTonGiao = tenTonGiao;
		this.listToKhai = listToKhai;
		this.listNhanKhau = listNhanKhau;
	}

	public int getMaTonGiao() {
		return maTonGiao;
	}

	public void setMaTonGiao(int maTonGiao) {
		this.maTonGiao = maTonGiao;
	}

	public String getTenTonGiao() {
		return tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
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
