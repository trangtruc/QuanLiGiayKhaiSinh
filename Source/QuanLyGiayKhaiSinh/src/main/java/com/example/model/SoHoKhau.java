package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="sohokhau")
public class SoHoKhau {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sohk",nullable=false)
	private int maHoKau;
	
	@Column(name="chuho",nullable=false)
	private String chuHo;
	
	@Column(name="ngaycap",nullable=false)
	private Date ngayCap;

	@ManyToOne
	@JoinColumn(name="sohokhau_xa_id")
	private Xa classXa;
	
	@OneToMany(mappedBy = "classSoHoKhau", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;

	public SoHoKhau() {
		super();
	}

	public SoHoKhau(String chuHo, Date ngayCap, Xa classXa, List<NhanKhau> listNhanKhau) {
		super();
		this.chuHo = chuHo;
		this.ngayCap = ngayCap;
		this.classXa = classXa;
		this.listNhanKhau = listNhanKhau;
	}

	public int getMaHoKau() {
		return maHoKau;
	}

	public void setMaHoKau(int maHoKau) {
		this.maHoKau = maHoKau;
	}

	public String getChuHo() {
		return chuHo;
	}

	public void setChuHo(String chuHo) {
		this.chuHo = chuHo;
	}

	public Date getNgayCap() {
		return ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}

	public Xa getClassXa() {
		return classXa;
	}

	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}

	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}

	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}
	
	
	
	
	
}
