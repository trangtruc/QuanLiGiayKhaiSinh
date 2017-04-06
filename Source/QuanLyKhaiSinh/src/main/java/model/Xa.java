package model;

import javax.persistence.*;

@Entity
@Table(name="xa")
public class Xa {
	private String maXa;
	private String tenXa;
	private Huyen classHuyen;
	public Xa() {
		super();
	}
	public Xa(String maXa, String tenXa, Huyen classHuyen) {
		super();
		this.maXa = maXa;
		this.tenXa = tenXa;
		this.classHuyen = classHuyen;
	}
	@Id
	public String getMaXa() {
		return maXa;
	}
	public void setMaXa(String maXa) {
		this.maXa = maXa;
	}
	public String getTenXa() {
		return tenXa;
	}
	public void setTenXa(String tenXa) {
		this.tenXa = tenXa;
	}
	@ManyToOne
	@JoinColumn(name="huyen_id")
	public Huyen getMaHuyen() {
		return classHuyen;
	}
	public void setMaHuyen(Huyen classHuyen) {
		this.classHuyen = classHuyen;
	}
	
	
	

}
