package model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="dantoc")
public class DanToc {
	private String maDanToc;
	private String tenDanToc;
	private List<ToKhai> listToKhai;
	private List<NhanKhau> listNhanKhau;
	public DanToc() {
		super();
	}
	public DanToc(String maDanToc, String tenDanToc, List<ToKhai> listToKhai, List<NhanKhau> listNhanKhau) {
		super();
		this.maDanToc = maDanToc;
		this.tenDanToc = tenDanToc;
		this.listToKhai = listToKhai;
		this.listNhanKhau = listNhanKhau;
	}
	@Id
	public String getMaDanToc() {
		return maDanToc;
	}
	public void setMaDanToc(String maDanToc) {
		this.maDanToc = maDanToc;
	}
	@NotNull
	public String getTenDanToc() {
		return tenDanToc;
	}
	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
	}
	
	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}
	@OneToMany(mappedBy = "classDanToc", cascade = CascadeType.ALL)
	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}
	
	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classDanToc", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}
	

}
