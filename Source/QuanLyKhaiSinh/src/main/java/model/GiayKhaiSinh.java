package model;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="giaykhaisinh")
public class GiayKhaiSinh {
	private String soKhaiSinh;
	private Date ngayCap;
	private String ghiChu;
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
	@Id
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
	@ManyToOne
	@JoinColumn(name="giaykhaisinh_tokhai_id")
	public ToKhai getClassToKhai() {
		return classToKhai;
	}
	public void setClassToKhai(ToKhai classToKhai) {
		this.classToKhai = classToKhai;
	}
	

}
