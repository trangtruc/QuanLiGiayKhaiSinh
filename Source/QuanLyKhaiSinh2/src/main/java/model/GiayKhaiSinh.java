package model;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="giaykhaisinh")
public class GiayKhaiSinh {
	
	@Column(name="soks",nullable=false)
	@Id
	private String soKhaiSinh;
	
	@Column(name="ngaycap",nullable=false)
	private Date ngayCap;
	
	@Column(name="ghichu",nullable=false)
	private String ghiChu;
	
	
	@Column(name="matk",nullable=false)
	@ManyToOne
	@JoinColumn(name="giayks_tk_id")
	private ToKhai classToKhai;
	
	public GiayKhaiSinh() {
		super();
	}

	public GiayKhaiSinh(String soKhaiSinh, Date ngayCap, String ghiChu, ToKhai classToKhai) {
		super();
		this.soKhaiSinh = soKhaiSinh;
		this.ngayCap = ngayCap;
		this.ghiChu = ghiChu;
		this.classToKhai = classToKhai;
	}

	public String getSoKhaiSinh() {
		return soKhaiSinh;
	}

	public void setSoKhaiSinh(String soKhaiSinh) {
		this.soKhaiSinh = soKhaiSinh;
	}

	public Date getNgayCap() {
		return ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public ToKhai getClassToKhai() {
		return classToKhai;
	}

	public void setClassToKhai(ToKhai classToKhai) {
		this.classToKhai = classToKhai;
	}
	
}
