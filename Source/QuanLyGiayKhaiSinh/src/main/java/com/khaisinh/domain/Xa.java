package com.khaisinh.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="xa")
public class Xa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="maxa",nullable=false)
	private int maXa;
	
	@Column(name="tenxa",nullable=false)
	private String tenXa;
	
	
	@ManyToOne
	@JoinColumn(name="huyen_xa_id")
	private Huyen classHuyen;
	
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	private List<CanBo> listCanBo;
	
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	private List<SoHoKhau> listSoHoKhau;
	
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai;
	
	@OneToMany(mappedBy = "classXa2", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai2;
	
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;

	public Xa() {
		super();
	}

	public Xa(String tenXa, Huyen classHuyen, List<CanBo> listCanBo, List<SoHoKhau> listSoHoKhau,
			List<ToKhai> listToKhai, List<ToKhai> listToKhai2, List<NhanKhau> listNhanKhau) {
		super();
		this.tenXa = tenXa;
		this.classHuyen = classHuyen;
		this.listCanBo = listCanBo;
		this.listSoHoKhau = listSoHoKhau;
		this.listToKhai = listToKhai;
		this.listToKhai2 = listToKhai2;
		this.listNhanKhau = listNhanKhau;
	}

	public int getMaXa() {
		return maXa;
	}

	public void setMaXa(int maXa) {
		this.maXa = maXa;
	}

	public String getTenXa() {
		return tenXa;
	}

	public void setTenXa(String tenXa) {
		this.tenXa = tenXa;
	}

	public Huyen getClassHuyen() {
		return classHuyen;
	}

	public void setClassHuyen(Huyen classHuyen) {
		this.classHuyen = classHuyen;
	}

	public List<CanBo> getListCanBo() {
		return listCanBo;
	}

	public void setListCanBo(List<CanBo> listCanBo) {
		this.listCanBo = listCanBo;
	}

	public List<SoHoKhau> getListSoHoKhau() {
		return listSoHoKhau;
	}

	public void setListSoHoKhau(List<SoHoKhau> listSoHoKhau) {
		this.listSoHoKhau = listSoHoKhau;
	}

	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}

	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}

	public List<ToKhai> getListToKhai2() {
		return listToKhai2;
	}

	public void setListToKhai2(List<ToKhai> listToKhai2) {
		this.listToKhai2 = listToKhai2;
	}

	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}

	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}

	
}
