package model;

import javax.persistence.*;

@Entity
@Table(name="dantoc")
public class DanToc {
	@Column(name="madt",nullable=false)
	@Id
	private String maDanToc;
	
	@Column(name="tendt",nullable=false)
	private String tenDanToc;
	
	public DanToc() {
		super();
	}

	public DanToc(String maDanToc, String tenDanToc) {
		super();
		this.maDanToc = maDanToc;
		this.tenDanToc = tenDanToc;
	}

	public String getMaDanToc() {
		return maDanToc;
	}

	public void setMaDanToc(String maDanToc) {
		this.maDanToc = maDanToc;
	}

	public String getTenDanToc() {
		return tenDanToc;
	}

	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
	}
	
	

}
