package model;


import javax.persistence.*;



@Entity
@Table(name="huyen")
public class Huyen {
	
	@Column(name="mahuyen",nullable=false)
	@Id
	private String maHuyen;
	
	@Column(name="tenhuyen",nullable=false)
	private String tenHuyen;
	
	@Column(name="matinh",nullable=false)
	@ManyToOne
	@JoinColumn(name="huyen_tinh_id")
	private Tinh classTinh;
	


	public Huyen() {
		super();
	}



	public Huyen(String maHuyen, String tenHuyen, Tinh classTinh) {
		super();
		this.maHuyen = maHuyen;
		this.tenHuyen = tenHuyen;
		this.classTinh = classTinh;
	}



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



	public Tinh getClassTinh() {
		return classTinh;
	}



	public void setClassTinh(Tinh classTinh) {
		this.classTinh = classTinh;
	}
	
	
	
	
	
	
	

}
