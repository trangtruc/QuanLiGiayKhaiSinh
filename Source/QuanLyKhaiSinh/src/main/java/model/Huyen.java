package model;


import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="huyen")
public class Huyen {
	private String maHuyen;
	private String tenHuyen;
	private Tinh classTinh;
	private List<Xa> listXa;
	public Huyen() {
		super();
	}
	
	public List<Xa> getListXa() {
		return listXa;
	}
	@OneToMany(mappedBy = "classHuyen", cascade = CascadeType.ALL)
	public void setListXa(List<Xa> listXa) {
		this.listXa = listXa;
	}

	public Huyen(String maHuyen, String tenHuyen, Tinh classTinh, List<Xa> listXa) {
		super();
		this.maHuyen = maHuyen;
		this.tenHuyen = tenHuyen;
		this.classTinh = classTinh;
		this.listXa = listXa;
	}

	@Id
	public String getMaHuyen() {
		return maHuyen;
	}
	public void setMaHuyen(String maHuyen) {
		this.maHuyen = maHuyen;
	}
	public String getTenHuyen() {
		return tenHuyen;
	}
	public void setTenHuyen(String tenHuyen) {
		this.tenHuyen = tenHuyen;
	}
	@ManyToOne
	@JoinColumn(name="huyen_tinh_id")
	public Tinh getTinh() {
		return classTinh;
	}
	public void setTinh(Tinh classTinh) {
		this.classTinh = classTinh;
	}
	
	
	
	
	
	

}
