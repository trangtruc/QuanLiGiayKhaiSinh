package com.example.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class QuanHeChuHo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="maqh",nullable=false)
	private int maQuanHe;
	
	@Column(name="tenqh",nullable=false)
	private String tenQuanHe;
	
	
	
	@OneToMany(mappedBy = "classQuanHeChuHo", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;
	
	
	@OneToMany(mappedBy = "classQuanHeVoiNgDK", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	
	public QuanHeChuHo() {
		super();
	}



	public QuanHeChuHo(String tenQuanHe) {
		super();
		this.tenQuanHe = tenQuanHe;
	}



	public int getMaQuanHe() {
		return maQuanHe;
	}



	public void setMaQuanHe(int maQuanHe) {
		this.maQuanHe = maQuanHe;
	}



	public String getTenQuanHe() {
		return tenQuanHe;
	}



	public void setTenQuanHe(String tenQuanHe) {
		this.tenQuanHe = tenQuanHe;
	}



	


	





	

}
