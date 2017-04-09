package model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tokhai")
public class ToKhai {
	private String maToKhai;
	private Date ngayLap;
	private String hoTenNguoiKS;
	private String gioiTinh;
	private Date ngaySinh;
	private String ngaySinhBC;
	private String noiSinh;
	private String ghiChu;
	private String quanHeVoiNgDK;
	private Xa classXa_noiDKKS;
	private Xa classXa_noiDKTT;
	private DanToc classDanToc;
	private TonGiao classTonGiao;
	private QuocTich classQuocTich;
	private NhanKhau classNhanKhau_Cha;
	private NhanKhau classNhanKhau_Me;
	private NhanKhau classNhanKhau_NgDK;
	private TinhTrangToKhai classTinTrangToKhai;
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
	@ManyToOne
	@JoinColumn(name="tokhai_tinhtrang_id")
	public TinhTrangToKhai getClassTinTrangToKhai() {
		return classTinTrangToKhai;
	}

	public void setClassTinTrangToKhai(TinhTrangToKhai classTinTrangToKhai) {
		this.classTinTrangToKhai = classTinTrangToKhai;
	}

	@Id
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
	@ManyToOne
	@JoinColumn(name="tokhai_xa1_id")
	public Xa getClassXa_noiDKKS() {
		return classXa_noiDKKS;
	}
	public void setClassXa_noiDKKS(Xa classXa_noiDKKS) {
		this.classXa_noiDKKS = classXa_noiDKKS;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_xa2_id")
	public Xa getClassXa_noiDKTT() {
		return classXa_noiDKTT;
	}
	public void setClassXa_noiDKTT(Xa classXa_noiDKTT) {
		this.classXa_noiDKTT = classXa_noiDKTT;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_dantoc_id")
	public DanToc getClassDanToc() {
		return classDanToc;
	}
	public void setClassDanToc(DanToc classDanToc) {
		this.classDanToc = classDanToc;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_tongiao_id")
	public TonGiao getClassTonGiao() {
		return classTonGiao;
	}
	public void setClassTonGiao(TonGiao classTonGiao) {
		this.classTonGiao = classTonGiao;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_quoctich_id")
	public QuocTich getClassQuocTich() {
		return classQuocTich;
	}
	public void setClassQuocTich(QuocTich classQuocTich) {
		this.classQuocTich = classQuocTich;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhau1_id")
	public NhanKhau getClassNhanKhau_Cha() {
		return classNhanKhau_Cha;
	}
	public void setClassNhanKhau_Cha(NhanKhau classNhanKhau_Cha) {
		this.classNhanKhau_Cha = classNhanKhau_Cha;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhau2_id")
	public NhanKhau getClassNhanKhau_Me() {
		return classNhanKhau_Me;
	}
	public void setClassNhanKhau_Me(NhanKhau classNhanKhau_Me) {
		this.classNhanKhau_Me = classNhanKhau_Me;
	}
	@ManyToOne
	@JoinColumn(name="tokhai_nhankhau3_id")
	public NhanKhau getClassNhanKhau_NgDK() {
		return classNhanKhau_NgDK;
	}
	public void setClassNhanKhau_NgDK(NhanKhau classNhanKhau_NgDK) {
		this.classNhanKhau_NgDK = classNhanKhau_NgDK;
	}
	public List<GiayKhaiSinh> getListGiayKhaiSinh() {
		return listGiayKhaiSinh;
	}
	@OneToMany(mappedBy = "classToKhai", cascade = CascadeType.ALL)
	public void setListGiayKhaiSinh(List<GiayKhaiSinh> listGiayKhaiSinh) {
		this.listGiayKhaiSinh = listGiayKhaiSinh;
	}
	
	
	

}
