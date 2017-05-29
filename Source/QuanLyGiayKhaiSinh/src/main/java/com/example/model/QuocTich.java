package com.example.model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="quoctich")
public class QuocTich {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="maqt",nullable=false)
	private int maQuocTich;
	
	@Column(name="tenqt",nullable=false)
	private String tenQuocTich;
	
	@OneToMany(mappedBy = "classQuocTich", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	@OneToMany(mappedBy = "classQuocTich2", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;

	public QuocTich() {
		super();
	}

	public QuocTich(String tenQuocTich, List<ToKhai> listToKhai, List<NhanKhau> listNhanKhau) {
		super();
		this.tenQuocTich = tenQuocTich;
		this.listToKhai = listToKhai;
		this.listNhanKhau = listNhanKhau;
	}

	public int getMaQuocTich() {
		return maQuocTich;
	}

	public void setMaQuocTich(int maQuocTich) {
		this.maQuocTich = maQuocTich;
	}

	public String getTenQuocTich() {
		return tenQuocTich;
	}

	public void setTenQuocTich(String tenQuocTich) {
		this.tenQuocTich = tenQuocTich;
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
