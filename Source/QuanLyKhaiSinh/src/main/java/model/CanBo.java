package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="canbo")
public class CanBo {
	
	@Column(name="macb",nullable=false)
	@Id
	private String maCanBo;
	
	@Column(name="hotencb",nullable=false)
	private String tenCanBo;
	
	@Column(name="ngaysinh",nullable=false)
	private Date ngaySinh;
	
	
	@Column(name="sdt",nullable=false)
	private String soDienThoai;
	
	@Column(name="email",nullable=false)
	private String eMail;
	
	@Column(name="maxa",nullable=false)
	@ManyToOne
	@JoinColumn(name="canbo_xa_id")
	private Xa classXa;
	
	@Column(name="macv",nullable=false)
	@ManyToOne
	@JoinColumn(name="canbo_cv_id")
	private ChucVu classChucVu;
	
	
	public CanBo() {
		super();
	}


	public CanBo(String maCanBo, String tenCanBo, Date ngaySinh, String soDienThoai, String eMail, Xa classXa,
			ChucVu classChucVu) {
		super();
		this.maCanBo = maCanBo;
		this.tenCanBo = tenCanBo;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.eMail = eMail;
		this.classXa = classXa;
		this.classChucVu = classChucVu;
	}


	public String getMaCanBo() {
		return maCanBo;
	}


	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}


	public String getTenCanBo() {
		return tenCanBo;
	}


	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public Xa getClassXa() {
		return classXa;
	}


	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}


	public ChucVu getClassChucVu() {
		return classChucVu;
	}


	public void setClassChucVu(ChucVu classChucVu) {
		this.classChucVu = classChucVu;
	}
	
	

}
