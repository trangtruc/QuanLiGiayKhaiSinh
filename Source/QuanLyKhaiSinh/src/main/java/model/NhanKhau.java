package model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class NhanKhau {
	
	@Column(name="mank",nullable=false)
	@Id
	private String maNhanKhau;
	
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
	
	@Column(name="madt",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_dt_id")
	private DanToc classDanToc;
	
	@Column(name="matg",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_tg_id")
	private TonGiao classTonGiao;
	
	@Column(name="maqt",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_qt_id")
	private QuocTich classQuocTich;
	
	@Column(name="maqh",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_qh_id")
	private QuanHeChuHo classQuanHeChuHo;
	
	@Column(name="sohk",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_shk_id")
	private SoHoKau classSoHoKau;
	
	@Column(name="maxa",nullable=false)
	@ManyToOne
	@JoinColumn(name="nhankhau_xa_id")
	private Xa classXa;

	
	
	

}
