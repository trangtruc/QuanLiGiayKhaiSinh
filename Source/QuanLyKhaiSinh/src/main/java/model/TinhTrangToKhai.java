package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tinhtrangtokhai")
public class TinhTrangToKhai {
	private int maTinhTrang;
	private String tenTinhTrang;
	private List<ToKhai> listToKhai;
	public TinhTrangToKhai() {
		super();
	}
	public TinhTrangToKhai(int maTinhTrang, String tenTinhTrang, List<ToKhai> listToKhai) {
		super();
		this.maTinhTrang = maTinhTrang;
		this.tenTinhTrang = tenTinhTrang;
		this.listToKhai = listToKhai;
	}
	@Id
	public int getMaTinhTrang() {
		return maTinhTrang;
	}
	public void setMaTinhTrang(int maTinhTrang) {
		this.maTinhTrang = maTinhTrang;
	}
	public String getTenTinhTrang() {
		return tenTinhTrang;
	}
	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}
	public List<ToKhai> getListToKhai() {
		return listToKhai;
	}
	@OneToMany(mappedBy = "classToKhai", cascade = CascadeType.ALL)
	public void setListToKhai(List<ToKhai> listToKhai) {
		this.listToKhai = listToKhai;
	}
	

}
