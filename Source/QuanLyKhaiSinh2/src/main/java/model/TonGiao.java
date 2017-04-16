package model;

import javax.persistence.*;

@Entity
@Table(name="tongiao")
public class TonGiao {
	@Column(name="matongiao",nullable=false)
	@Id
	private String maTonGiao;
	
	@Column(name="tentongiao",nullable=false)
	private String tenTonGiao;
	
	
	public TonGiao() {
		super();
	}


	public TonGiao(String maTonGiao, String tenTonGiao) {
		super();
		this.maTonGiao = maTonGiao;
		this.tenTonGiao = tenTonGiao;
	}


	public String getMaTonGiao() {
		return maTonGiao;
	}


	public void setMaTonGiao(String maTonGiao) {
		this.maTonGiao = maTonGiao;
	}


	public String getTenTonGiao() {
		return tenTonGiao;
	}


	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}
	
	
	

}
