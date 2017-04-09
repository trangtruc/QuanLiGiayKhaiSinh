package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="quoctich")
public class QuocTich {
	private String maQuocTich;
	private String tenQuocTich;
	private List<NhanKhau> listNhanKhau;
	private List<ToKhai> listToKhai;
	
	public QuocTich() {
		super();
	}

	public QuocTich(String maQuocTich, String tenQuocTich, List<NhanKhau> listNhanKhau, List<ToKhai> listToKhai) {
		super();
		this.maQuocTich = maQuocTich;
		this.tenQuocTich = tenQuocTich;
		this.listNhanKhau = listNhanKhau;
		this.listToKhai = listToKhai;
	}

	@Id
	public String getMaQuocTich() {
		return maQuocTich;
	}

	public void setMaQuocTich(String maQuocTich) {
		this.maQuocTich = maQuocTich;
	}

	public String getTenQuocTich() {
		return tenQuocTich;
	}

	public void setTenQuocTich(String tenQuocTich) {
		this.tenQuocTich = tenQuocTich;
	}

	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classQuocTich", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}

	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}
	@OneToMany(mappedBy = "classQuocTich", cascade = CascadeType.ALL)
	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}
	
	

}
