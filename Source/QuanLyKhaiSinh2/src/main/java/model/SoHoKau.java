package model;

import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name="sohokau")
public class SoHoKau {
	@Column(name="sohk",nullable=false)
	@Id
	private String maHoKau;
	
	@Column(name="chuho",nullable=false)
	private String chuHo;
	
	@Column(name="ngaycap",nullable=false)
	private Date ngayCap;
	
	@Column(name="maxa",nullable=false)
	@ManyToOne
	@JoinColumn(name="sohokau_xa_id")
	private Xa classXa;
	
	public SoHoKau() {
		super();
	}

	public SoHoKau(String maHoKau, String chuHo, Date ngayCap, Xa classXa) {
		super();
		this.maHoKau = maHoKau;
		this.chuHo = chuHo;
		this.ngayCap = ngayCap;
		this.classXa = classXa;
	}

	public String getMaHoKau() {
		return maHoKau;
	}

	public void setMaHoKau(String maHoKau) {
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
	
}
