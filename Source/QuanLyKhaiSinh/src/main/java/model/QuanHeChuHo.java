package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class QuanHeChuHo {
	private String maQuanHe;
	private String tenQuanHe;
	private List<NhanKhau> listNhanKhau;
	public QuanHeChuHo() {
		super();
	}
	public QuanHeChuHo(String maQuanHe, String tenQuanHe, List<NhanKhau> listNhanKhau) {
		super();
		this.maQuanHe = maQuanHe;
		this.tenQuanHe = tenQuanHe;
		this.listNhanKhau = listNhanKhau;
	}
	@Id
	public String getMaQuanHe() {
		return maQuanHe;
	}
	public void setMaQuanHe(String maQuanHe) {
		this.maQuanHe = maQuanHe;
	}
	public String getTenQuanHe() {
		return tenQuanHe;
	}
	public void setTenQuanHe(String tenQuanHe) {
		this.tenQuanHe = tenQuanHe;
	}
	
	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classQuanHe", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}
	
	
	
	
	

}
