package model;

import javax.persistence.*;

@Entity
@Table(name="quoctich")
public class QuocTich {
	@Column(name="maqt",nullable=false)
	@Id
	private String maQuocTich;
	
	@Column(name="tenqt",nullable=false)
	private String tenQuocTich;
	
	
	public QuocTich() {
		super();
	}


	public QuocTich(String maQuocTich, String tenQuocTich) {
		super();
		this.maQuocTich = maQuocTich;
		this.tenQuocTich = tenQuocTich;
	}


	public String getMaQuocTich() {
		return maQuocTich;
	}


	public void setMaQuocTich(String maQuocTich) {
		this.maQuocTich = maQuocTich;
	}


	public String getTenQuocTich() {
		return tenQuocTich;
	}


	public void setTenQuocTich(String tenQuocTich) {
		this.tenQuocTich = tenQuocTich;
	}

	
}
