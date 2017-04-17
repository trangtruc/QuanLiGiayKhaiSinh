package com.khaisinh.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="nhankhau")
public class NhanKhau {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mank",nullable=false)
	private int maNhanKhau;
	
	@Column(name="hotennk",nullable=false)
	private String hoTenNhanKhau;
	
	@Column(name="gioitinh",nullable=false)
	private String gioiTinh;
	
	@Column(name="ngaysinh",nullable=false)
	private Date ngaySinh;
	
	@Column(name="ngaysinhbc",nullable=false)
	private String ngaySinhBC;
	
	@Column(name="cmnd",nullable=false)
	private String CMND;
	
	@Column(name="ngaycapcmnd",nullable=false)
	private Date ngayCapCMND;
	
	@Column(name="noicapcmnd",nullable=false)
	private String noiCapCMND;
	
	
	@ManyToOne
	@JoinColumn(name="nhankhau_dt_id")
	private DanToc classDanToc;
	
	
	@ManyToOne
	@JoinColumn(name="nhankhau_tg_id")
	private TonGiao classTonGiao;
	

	@ManyToOne
	@JoinColumn(name="nhankhau_qt_id")
	private QuocTich classQuocTich;
	
	
	@ManyToOne
	@JoinColumn(name="nhankhau_qh_id")
	private QuanHeChuHo classQuanHeChuHo;
	

	@ManyToOne
	@JoinColumn(name="nhankhau_xa_id")
	private Xa classXa;
	
	@OneToMany(mappedBy = "classNhanKhau_Cha", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai_cha;
	
	@OneToMany(mappedBy = "classNhanKhau_Me", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai_me;
	
	@OneToMany(mappedBy = "classNhanKhau_Ngdk", cascade = CascadeType.ALL)
	private List<ToKhai> listToKhai_ngdk;
	
	
	@ManyToOne
	@JoinColumn(name="sohk")
	private SoHoKhau classSoHoKhau;

	public NhanKhau() {
		super();
	}

	public NhanKhau(String hoTenNhanKhau, String gioiTinh, Date ngaySinh, String ngaySinhBC, String cMND,
			Date ngayCapCMND, String noiCapCMND, DanToc classDanToc, TonGiao classTonGiao, QuocTich classQuocTich,
			QuanHeChuHo classQuanHeChuHo, Xa classXa, List<ToKhai> listToKhai_cha, List<ToKhai> listToKhai_me,
			List<ToKhai> listToKhai_ngdk, SoHoKhau classSoHoKhau) {
		super();
		this.hoTenNhanKhau = hoTenNhanKhau;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.ngaySinhBC = ngaySinhBC;
		CMND = cMND;
		this.ngayCapCMND = ngayCapCMND;
		this.noiCapCMND = noiCapCMND;
		this.classDanToc = classDanToc;
		this.classTonGiao = classTonGiao;
		this.classQuocTich = classQuocTich;
		this.classQuanHeChuHo = classQuanHeChuHo;
		this.classXa = classXa;
		this.listToKhai_cha = listToKhai_cha;
		this.listToKhai_me = listToKhai_me;
		this.listToKhai_ngdk = listToKhai_ngdk;
		this.classSoHoKhau = classSoHoKhau;
	}

	public int getMaNhanKhau() {
		return maNhanKhau;
	}

	public void setMaNhanKhau(int maNhanKhau) {
		this.maNhanKhau = maNhanKhau;
	}

	public String getHoTenNhanKhau() {
		return hoTenNhanKhau;
	}

	public void setHoTenNhanKhau(String hoTenNhanKhau) {
		this.hoTenNhanKhau = hoTenNhanKhau;
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

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public Date getNgayCapCMND() {
		return ngayCapCMND;
	}

	public void setNgayCapCMND(Date ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}

	public String getNoiCapCMND() {
		return noiCapCMND;
	}

	public void setNoiCapCMND(String noiCapCMND) {
		this.noiCapCMND = noiCapCMND;
	}

	public DanToc getClassDanToc() {
		return classDanToc;
	}

	public void setClassDanToc(DanToc classDanToc) {
		this.classDanToc = classDanToc;
	}

	public TonGiao getClassTonGiao() {
		return classTonGiao;
	}

	public void setClassTonGiao(TonGiao classTonGiao) {
		this.classTonGiao = classTonGiao;
	}

	public QuocTich getClassQuocTich() {
		return classQuocTich;
	}

	public void setClassQuocTich(QuocTich classQuocTich) {
		this.classQuocTich = classQuocTich;
	}

	public QuanHeChuHo getClassQuanHeChuHo() {
		return classQuanHeChuHo;
	}

	public void setClassQuanHeChuHo(QuanHeChuHo classQuanHeChuHo) {
		this.classQuanHeChuHo = classQuanHeChuHo;
	}

	public Xa getClassXa() {
		return classXa;
	}

	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}

	public List<ToKhai> getListToKhai_cha() {
		return listToKhai_cha;
	}

	public void setListToKhai_cha(List<ToKhai> listToKhai_cha) {
		this.listToKhai_cha = listToKhai_cha;
	}

	public List<ToKhai> getListToKhai_me() {
		return listToKhai_me;
	}

	public void setListToKhai_me(List<ToKhai> listToKhai_me) {
		this.listToKhai_me = listToKhai_me;
	}

	public List<ToKhai> getListToKhai_ngdk() {
		return listToKhai_ngdk;
	}

	public void setListToKhai_ngdk(List<ToKhai> listToKhai_ngdk) {
		this.listToKhai_ngdk = listToKhai_ngdk;
	}

	public SoHoKhau getClassSoHoKhau() {
		return classSoHoKhau;
	}

	public void setClassSoHoKhau(SoHoKhau classSoHoKhau) {
		this.classSoHoKhau = classSoHoKhau;
	}

	

}
