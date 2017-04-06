package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="canbo")
public class CanBo {
	private String maCanBo;
	private String tenCanBo;
	private Date ngaySinh;
	private String ngaySinhBC;
	private String soDienThoai;
	private String eMail;
	private Xa classXa;
	private ChucVu classChucVu;
	public CanBo() {
		super();
	}
	public CanBo(String maCanBo, String tenCanBo, Date ngaySinh, String ngaySinhBC, String soDienThoai, String eMail,
			Xa classXa, ChucVu classChucVu) {
		super();
		this.maCanBo = maCanBo;
		this.tenCanBo = tenCanBo;
		this.ngaySinh = ngaySinh;
		this.ngaySinhBC = ngaySinhBC;
		this.soDienThoai = soDienThoai;
		this.eMail = eMail;
		this.classXa = classXa;
		this.classChucVu = classChucVu;
	}
	@Id
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
	public String getNgaySinhBC() {
		return ngaySinhBC;
	}
	public void setNgaySinhBC(String ngaySinhBC) {
		this.ngaySinhBC = ngaySinhBC;
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
	@ManyToOne
	@JoinColumn(name="chucvu_id")
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
