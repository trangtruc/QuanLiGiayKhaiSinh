package com.example.model;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="tinh")
public class Tinh {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maTinh;
	

	private String tenTinh;
	
	@OneToMany(mappedBy = "classTinh", cascade = CascadeType.ALL)
	private List<Huyen> listHuyen;
	
	public Tinh() {
		super();
	}

	

	public Tinh(String tenTinh, List<Huyen> listHuyen) {
		super();
		this.tenTinh = tenTinh;
		this.listHuyen = listHuyen;
	}



	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	public List<Huyen> getListHuyen() {
		return listHuyen;
	}

	public void setListHuyen(List<Huyen> listHuyen) {
		this.listHuyen = listHuyen;
	}

	

	
	
	

}
