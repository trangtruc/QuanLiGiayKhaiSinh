package model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tinh")
public class Tinh {
	private String maTinh;
	private String tenTinh;
	private List<Huyen> listHuyen;
	public Tinh() {
		super();
	}
	
	public List<Huyen> getListHuyen() {
		return listHuyen;
	}
	@OneToMany(mappedBy = "classTinh", cascade = CascadeType.ALL)
	public void setListHuyen(List<Huyen> listHuyen) {
		this.listHuyen = listHuyen;
	}

	public Tinh(String maTinh, String tenTinh, List<Huyen> listHuyen) {
		super();
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
		this.listHuyen = listHuyen;
	}

	@Id
	public String getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	

}
