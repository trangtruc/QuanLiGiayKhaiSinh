package com.example.model;


import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tinhtrangtokhai")
public class TinhTrangToKhai {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="matt",nullable=false)
	private int maTinhTrang;
	
	@Column(name="trangthai",nullable=false)
	private String tenTinhTrang;
	
	
	@Column(name="matk",nullable=false)
	@OneToMany(mappedBy = "classTinhTrangToKhai", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	public TinhTrangToKhai() {
		super();
	}

	public TinhTrangToKhai(String tenTinhTrang, List<ToKhai> listToKhai) {
		super();
		this.tenTinhTrang = tenTinhTrang;
		this.listToKhai = listToKhai;
	}

	public int getMaTinhTrang() {
		return maTinhTrang;
	}

	public void setMaTinhTrang(int maTinhTrang) {
		this.maTinhTrang = maTinhTrang;
	}

	public String getTenTinhTrang() {
		return tenTinhTrang;
	}

	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}

	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}

	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}
	


}
