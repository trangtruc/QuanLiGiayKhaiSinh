package model;


import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="huyen")
public class Huyen {
	private String maHuyen;
	private String tenHuyen;
	private Tinh classtinh;
	private List<Xa> listXa;
	public Huyen() {
		super();
	}
	@OneToMany(mappedBy = "classHuyen", cascade = CascadeType.ALL)
	public List<Xa> getListXa() {
		return listXa;
	}

	public void setListXa(List<Xa> listXa) {
		this.listXa = listXa;
	}

	public Huyen(String maHuyen, String tenHuyen, Tinh classtinh, List<Xa> listXa) {
		super();
		this.maHuyen = maHuyen;
		this.tenHuyen = tenHuyen;
		this.classtinh = classtinh;
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
	@JoinColumn(name="tinh_id")
	public Tinh getTinh() {
		return classtinh;
	}
	public void setTinh(Tinh classtinh) {
		this.classtinh = classtinh;
	}
	
	
	
	
	
	

}
