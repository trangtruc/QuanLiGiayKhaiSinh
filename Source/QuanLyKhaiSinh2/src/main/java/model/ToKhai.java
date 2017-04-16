package model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tokhai")
public class ToKhai {
	@Column(name="matk",nullable=false)
	@Id
	private String maToKhai;
	
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
	
	@Column(name="maxa",nullable=false)
	@ManyToOne
	@JoinColumn(name="noidkks_id")
	private Xa classXa_noiDKKS;
	
	@Column(name="xa_maxa",nullable=false)
	@ManyToOne
	@JoinColumn(name="noidktt_id")
	private Xa classXa_noiDKTT;
	
	@Column(name="madt",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_dantoc_id1")
	private DanToc classDanToc;
	
	@Column(name="matg",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_tongiao_id2")
	private TonGiao classTonGiao;
	
	@Column(name="maqt",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_quoctich_id3")
	private QuocTich classQuocTich;
	
	@Column(name="mank",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhauCha_id4")
	private NhanKhau classNhanKhau_Cha;
	
	@Column(name="nha_mank",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhauMe_id5")
	private NhanKhau classNhanKhau_Me;
	
	@Column(name="nha_mank2",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhauNgdk_id6")
	private NhanKhau classNhanKhau_NgDK;
	
	@Column(name="matt",nullable=false)
	@ManyToOne
	@JoinColumn(name="tokhai_tinhtrang_id7")
	private TinhTrangToKhai classTinTrangToKhai;
	
	@Column(name="soks",nullable=false)
	@OneToMany(mappedBy = "classToKhai", cascade = CascadeType.ALL)
	private List<GiayKhaiSinh> listGiayKhaiSinh;
	public ToKhai() {
		super();
	}
	
	public ToKhai(String maToKhai, Date ngayLap, String hoTenNguoiKS, String gioiTinh, Date ngaySinh, String ngaySinhBC,
			String noiSinh, String ghiChu, String quanHeVoiNgDK, Xa classXa_noiDKKS, Xa classXa_noiDKTT,
			DanToc classDanToc, TonGiao classTonGiao, QuocTich classQuocTich, NhanKhau classNhanKhau_Cha,
			NhanKhau classNhanKhau_Me, NhanKhau classNhanKhau_NgDK, TinhTrangToKhai classTinTrangToKhai,
			List<GiayKhaiSinh> listGiayKhaiSinh) {
		super();
		this.maToKhai = maToKhai;
		this.ngayLap = ngayLap;
		this.hoTenNguoiKS = hoTenNguoiKS;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.ngaySinhBC = ngaySinhBC;
		this.noiSinh = noiSinh;
		this.ghiChu = ghiChu;
		this.quanHeVoiNgDK = quanHeVoiNgDK;
		this.classXa_noiDKKS = classXa_noiDKKS;
		this.classXa_noiDKTT = classXa_noiDKTT;
		this.classDanToc = classDanToc;
		this.classTonGiao = classTonGiao;
		this.classQuocTich = classQuocTich;
		this.classNhanKhau_Cha = classNhanKhau_Cha;
		this.classNhanKhau_Me = classNhanKhau_Me;
		this.classNhanKhau_NgDK = classNhanKhau_NgDK;
		this.classTinTrangToKhai = classTinTrangToKhai;
		this.listGiayKhaiSinh = listGiayKhaiSinh;
	}
	
	public TinhTrangToKhai getClassTinTrangToKhai() {
		return classTinTrangToKhai;
	}

	public void setClassTinTrangToKhai(TinhTrangToKhai classTinTrangToKhai) {
		this.classTinTrangToKhai = classTinTrangToKhai;
	}

	
	public String getMaToKhai() {
		return maToKhai;
	}
	public void setMaToKhai(String maToKhai) {
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
	
	public Xa getClassXa_noiDKKS() {
		return classXa_noiDKKS;
	}
	public void setClassXa_noiDKKS(Xa classXa_noiDKKS) {
		this.classXa_noiDKKS = classXa_noiDKKS;
	}
	
	public Xa getClassXa_noiDKTT() {
		return classXa_noiDKTT;
	}
	public void setClassXa_noiDKTT(Xa classXa_noiDKTT) {
		this.classXa_noiDKTT = classXa_noiDKTT;
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
	
	public NhanKhau getClassNhanKhau_NgDK() {
		return classNhanKhau_NgDK;
	}
	public void setClassNhanKhau_NgDK(NhanKhau classNhanKhau_NgDK) {
		this.classNhanKhau_NgDK = classNhanKhau_NgDK;
	}
	public List<GiayKhaiSinh> getListGiayKhaiSinh() {
		return listGiayKhaiSinh;
	}
	
	public void setListGiayKhaiSinh(List<GiayKhaiSinh> listGiayKhaiSinh) {
		this.listGiayKhaiSinh = listGiayKhaiSinh;
	}
	
	
	

}
