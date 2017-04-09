package model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="sohokau")
public class SoHoKau {
	private String maHoKau;
	private String chuHo;
	private Date ngayCap;
	private List<NhanKhau> listNhanKhau;
	private Xa classXa;
	public SoHoKau() {
		super();
	}
	public SoHoKau(String maHoKau, String chuHo, Date ngayCap, List<NhanKhau> listNhanKhau, Xa classXa) {
		super();
		this.maHoKau = maHoKau;
		this.chuHo = chuHo;
		this.ngayCap = ngayCap;
		this.listNhanKhau = listNhanKhau;
		this.classXa = classXa;
	}
	@Id
	public String getMaHoKau() {
		return maHoKau;
	}
	public void setMaHoKau(String maHoKau) {
		this.maHoKau = maHoKau;
	}
	public String getChuHo() {
		return chuHo;
	}
	public void setChuHo(String chuHo) {
		this.chuHo = chuHo;
	}
	public Date getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}
	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classSoHoKau", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}
	@ManyToOne
	@JoinColumn(name="sohokau_xa_id")
	public Xa getClassXa() {
		return classXa;
	}
	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}
	

}
