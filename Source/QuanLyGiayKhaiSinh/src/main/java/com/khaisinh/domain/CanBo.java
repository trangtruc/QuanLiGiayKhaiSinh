package com.khaisinh.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="canbo")
public class CanBo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="macb",nullable=false)
	
	private int maCanBo;
	
	@Column(name="hotencb",nullable=false)
	private String tenCanBo;
	
	@Column(name="ngaysinh",nullable=false)
	private Date ngaySinh;
	
	
	@Column(name="sdt",nullable=false)
	private String soDienThoai;
	
	@Column(name="email",nullable=false)
	private String eMail;
	
	
	@ManyToOne
	@JoinColumn(name="canbo_xa_id")
	private Xa classXa;
	
	@ManyToOne
	@JoinColumn(name="canbo_cv_id")
	private ChucVu classChucVu;
	
	private String userName;
	private String passWord;
	
	public CanBo() {
		super();
	}
	



	public CanBo(String tenCanBo, Date ngaySinh, String soDienThoai, String eMail, Xa classXa, ChucVu classChucVu,
			String userName, String passWord) {
		super();
		this.tenCanBo = tenCanBo;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.eMail = eMail;
		this.classXa = classXa;
		this.classChucVu = classChucVu;
		this.userName = userName;
		this.passWord = passWord;
	}








	public ChucVu getClassChucVu() {
		return classChucVu;
	}








	public void setClassChucVu(ChucVu classChucVu) {
		this.classChucVu = classChucVu;
	}








	public String getUserName() {
		return userName;
	}








	public void setUserName(String userName) {
		this.userName = userName;
	}








	public String getPassWord() {
		return passWord;
	}








	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}








	public int getMaCanBo() {
		return maCanBo;
	}


	public void setMaCanBo(int maCanBo) {
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


	

	

}
