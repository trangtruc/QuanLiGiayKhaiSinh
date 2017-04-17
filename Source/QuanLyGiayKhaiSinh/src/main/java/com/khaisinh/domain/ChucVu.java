package com.khaisinh.domain;



import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="chucvu")
public class ChucVu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="macv",nullable=false)
	private int maChucVu;
	
	
	@Column(name="tencv",nullable=false)
	private String tenChucVu;
	
	
	@OneToMany(mappedBy = "classChucVu", cascade = CascadeType.ALL)
	@Column(name="macb",nullable=false)
	private List<CanBo> listCanBo;
	
	
	public ChucVu() {
		super();
	}


	


	public ChucVu(String tenChucVu, List<CanBo> listCanBo) {
		super();
		this.tenChucVu = tenChucVu;
		this.listCanBo = listCanBo;
	}




	public int getMaChucVu() {
		return maChucVu;
	}


	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}


	public String getTenChucVu() {
		return tenChucVu;
	}


	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}


	public List<CanBo> getListCanBo() {
		return listCanBo;
	}


	public void setListCanBo(List<CanBo> listCanBo) {
		this.listCanBo = listCanBo;
	}

	
	
	

}
