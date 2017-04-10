package model;


import javax.persistence.*;

@Entity
@Table(name="tinhtrangtokhai")
public class TinhTrangToKhai {
	@Column(name="matt",nullable=false)
	@Id
	private int maTinhTrang;
	
	@Column(name="trangthai",nullable=false)
	private String tenTinhTrang;
	
	
	
	public TinhTrangToKhai() {
		super();
	}



	public TinhTrangToKhai(int maTinhTrang, String tenTinhTrang) {
		super();
		this.maTinhTrang = maTinhTrang;
		this.tenTinhTrang = tenTinhTrang;
	}



	public int getMaTinhTrang() {
		return maTinhTrang;
	}



	public void setMaTinhTrang(int maTinhTrang) {
		this.maTinhTrang = maTinhTrang;
	}



	public String getTenTinhTrang() {
		return tenTinhTrang;
	}



	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}
	
}
