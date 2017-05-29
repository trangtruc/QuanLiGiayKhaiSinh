package com.example.model;


import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="huyen")
public class Huyen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int maHuyen;
	
	private String tenHuyen;
	
	
	@ManyToOne
	@JoinColumn(name="huyen_tinh_id")
	private Tinh classTinh;
	
	
	@OneToMany(mappedBy = "classHuyen", cascade = CascadeType.ALL)
	private List<Xa> listXa;


	public Huyen() {
		super();
	}




	public Huyen(String tenHuyen, Tinh classTinh, List<Xa> listXa) {
		super();
		this.tenHuyen = tenHuyen;
		this.classTinh = classTinh;
		this.listXa = listXa;
	}













	public List<Xa> getListXa() {
		return listXa;
	}






	public void setListXa(List<Xa> listXa) {
		this.listXa = listXa;
	}






	public int getMaHuyen() {
		return maHuyen;
	}



	public void setMaHuyen(int maHuyen) {
		this.maHuyen = maHuyen;
	}



	public String getTenHuyen() {
		return tenHuyen;
	}



	public void setTenHuyen(String tenHuyen) {
		this.tenHuyen = tenHuyen;
	}



	public Tinh getClassTinh() {
		return classTinh;
	}



	public void setClassTinh(Tinh classTinh) {
		this.classTinh = classTinh;
	}
	



	
	

}
