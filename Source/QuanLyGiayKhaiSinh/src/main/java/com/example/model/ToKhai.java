package com.example.model;

import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name="tokhai")
public class ToKhai {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="matk",nullable=false)
	private int maToKhai;
	
	@Column(name="ngatlap",nullable=false)
	private Date ngayLap;
	
	@Column(name="htnks",nullable=false)
	private String hoTenNguoiKS;
	
	@Column(name="gioitinh",nullable=false)
	private String gioiTinh;
	
	@Column(name="ngaysinh",nullable=false)
	private Date ngaySinh;
	
	@Column(name="ngaysinhbc",nullable=false)
	private String ngaySinhBC;
	
	@Column(name="noisinh",nullable=false)
	private String noiSinh;
	
	@Column(name="ghichu",nullable=false)
	private String ghiChu;
	
	@Column(name="quanhevoingdk",nullable=false)
	private String quanHeVoiNgDK;
	
	
	@ManyToOne
	@JoinColumn(name="noidkks_id")
	private Xa classXa;
	
	@ManyToOne
	@JoinColumn(name="diachitt_id")
	private Xa classXa2;
	
	@ManyToOne
	@JoinColumn(name="tinhtrangtokhai_id")
	private TinhTrangToKhai classTinhTrangToKhai;
	
	
	@ManyToOne
	@JoinColumn(name="dantoc_id")
	private DanToc classDanToc;
	
	@ManyToOne
	@JoinColumn(name="quoctich_id")
	private QuocTich classQuocTich;
	

	@ManyToOne
	@JoinColumn(name="tongiao_id")
	private TonGiao classTonGiao;
	
	@ManyToOne
	@JoinColumn(name="cha_id")
	private NhanKhau classNhanKhau_Cha;
	
	@ManyToOne
	@JoinColumn(name="me_id")
	private NhanKhau classNhanKhau_Me;
	
	
	@ManyToOne
	@JoinColumn(name="ngdk_id")
	private NhanKhau classNhanKhau_Ngdk;


	public ToKhai() {
		super();
	}


	public ToKhai(Date ngayLap, String hoTenNguoiKS, String gioiTinh, Date ngaySinh, String ngaySinhBC, String noiSinh,
			String ghiChu, String quanHeVoiNgDK, Xa classXa, Xa classXa2, TinhTrangToKhai classTinhTrangToKhai,
			DanToc classDanToc, QuocTich classQuocTich, TonGiao classTonGiao, NhanKhau classNhanKhau_Cha,
			NhanKhau classNhanKhau_Me, NhanKhau classNhanKhau_Ngdk) {
		super();
		this.ngayLap = ngayLap;
		this.hoTenNguoiKS = hoTenNguoiKS;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.ngaySinhBC = ngaySinhBC;
		this.noiSinh = noiSinh;
		this.ghiChu = ghiChu;
		this.quanHeVoiNgDK = quanHeVoiNgDK;
		this.classXa = classXa;
		this.classXa2 = classXa2;
		this.classTinhTrangToKhai = classTinhTrangToKhai;
		this.classDanToc = classDanToc;
		this.classQuocTich = classQuocTich;
		this.classTonGiao = classTonGiao;
		this.classNhanKhau_Cha = classNhanKhau_Cha;
		this.classNhanKhau_Me = classNhanKhau_Me;
		this.classNhanKhau_Ngdk = classNhanKhau_Ngdk;
	}


	public int getMaToKhai() {
		return maToKhai;
	}


	public void setMaToKhai(int maToKhai) {
		this.maToKhai = maToKhai;
	}


	public Date getNgayLap() {
		return ngayLap;
	}


	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}


	public String getHoTenNguoiKS() {
		return hoTenNguoiKS;
	}


	public void setHoTenNguoiKS(String hoTenNguoiKS) {
		this.hoTenNguoiKS = hoTenNguoiKS;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getNgaySinhBC() {
		return ngaySinhBC;
	}


	public void setNgaySinhBC(String ngaySinhBC) {
		this.ngaySinhBC = ngaySinhBC;
	}


	public String getNoiSinh() {
		return noiSinh;
	}


	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}


	public String getGhiChu() {
		return ghiChu;
	}


	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}


	public String getQuanHeVoiNgDK() {
		return quanHeVoiNgDK;
	}


	public void setQuanHeVoiNgDK(String quanHeVoiNgDK) {
		this.quanHeVoiNgDK = quanHeVoiNgDK;
	}


	public Xa getClassXa() {
		return classXa;
	}


	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}


	public Xa getClassXa2() {
		return classXa2;
	}


	public void setClassXa2(Xa classXa2) {
		this.classXa2 = classXa2;
	}


	public TinhTrangToKhai getClassTinhTrangToKhai() {
		return classTinhTrangToKhai;
	}


	public void setClassTinhTrangToKhai(TinhTrangToKhai classTinhTrangToKhai) {
		this.classTinhTrangToKhai = classTinhTrangToKhai;
	}


	public DanToc getClassDanToc() {
		return classDanToc;
	}


	public void setClassDanToc(DanToc classDanToc) {
		this.classDanToc = classDanToc;
	}


	public QuocTich getClassQuocTich() {
		return classQuocTich;
	}


	public void setClassQuocTich(QuocTich classQuocTich) {
		this.classQuocTich = classQuocTich;
	}


	public TonGiao getClassTonGiao() {
		return classTonGiao;
	}


	public void setClassTonGiao(TonGiao classTonGiao) {
		this.classTonGiao = classTonGiao;
	}


	public NhanKhau getClassNhanKhau_Cha() {
		return classNhanKhau_Cha;
	}


	public void setClassNhanKhau_Cha(NhanKhau classNhanKhau_Cha) {
		this.classNhanKhau_Cha = classNhanKhau_Cha;
	}


	public NhanKhau getClassNhanKhau_Me() {
		return classNhanKhau_Me;
	}


	public void setClassNhanKhau_Me(NhanKhau classNhanKhau_Me) {
		this.classNhanKhau_Me = classNhanKhau_Me;
	}


	public NhanKhau getClassNhanKhau_Ngdk() {
		return classNhanKhau_Ngdk;
	}


	public void setClassNhanKhau_Ngdk(NhanKhau classNhanKhau_Ngdk) {
		this.classNhanKhau_Ngdk = classNhanKhau_Ngdk;
	}
	
	
	
	
	
	
	
}