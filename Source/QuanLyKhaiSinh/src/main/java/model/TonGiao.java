package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tongiao")
public class TonGiao {
	private String maTonGiao;
	private String tenTonGiao;
	private List<NhanKhau> listNhanKhau;
	private List<ToKhai> listToKhai;
	public TonGiao() {
		super();
	}
	public TonGiao(String maTonGiao, String tenTonGiao, List<NhanKhau> listNhanKhau, List<ToKhai> listToKhai) {
		super();
		this.maTonGiao = maTonGiao;
		this.tenTonGiao = tenTonGiao;
		this.listNhanKhau = listNhanKhau;
		this.listToKhai = listToKhai;
	}
	@Id
	public String getMaTonGiao() {
		return maTonGiao;
	}
	public void setMaTonGiao(String maTonGiao) {
		this.maTonGiao = maTonGiao;
	}
	public String getTenTonGiao() {
		return tenTonGiao;
	}
	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}
	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classTonGiao", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}
	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}
	@OneToMany(mappedBy = "classTonGiao", cascade = CascadeType.ALL)
	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}
	
	
	
	

}
