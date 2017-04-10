package model;

import javax.persistence.*;

@Entity
@Table(name="xa")
public class Xa {
	
	@Column(name="maxa",nullable=false)
	@Id
	private String maXa;
	
	@Column(name="tenxa",nullable=false)
	private String tenXa;
	
	
	@Column(name="mahuyen",nullable=false)
	@ManyToOne
	@JoinColumn(name="huyen_id")
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



	public Huyen getClassHuyen() {
		return classHuyen;
	}



	public void setClassHuyen(Huyen classHuyen) {
		this.classHuyen = classHuyen;
	}
	

	
	

}
