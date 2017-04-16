package model;

import javax.persistence.*;

@Entity
public class QuanHeChuHo {
	@Column(name="maqh",nullable=false)
	@Id
	private String maQuanHe;
	
	@Column(name="tenqh",nullable=false)
	private String tenQuanHe;
	
	public QuanHeChuHo() {
		super();
	}

	public QuanHeChuHo(String maQuanHe, String tenQuanHe) {
		super();
		this.maQuanHe = maQuanHe;
		this.tenQuanHe = tenQuanHe;
	}

	public String getMaQuanHe() {
		return maQuanHe;
	}

	public void setMaQuanHe(String maQuanHe) {
		this.maQuanHe = maQuanHe;
	}

	public String getTenQuanHe() {
		return tenQuanHe;
	}

	public void setTenQuanHe(String tenQuanHe) {
		this.tenQuanHe = tenQuanHe;
	}
	
	
	

}
