package model;



import javax.persistence.*;

@Entity
@Table(name="chucvu")
public class ChucVu {
	
	@Column(name="macv",nullable=false)
	@Id
	private String maChucVu;
	
	
	@Column(name="tencv",nullable=false)
	private String tenChucVu;
	
	public ChucVu() {
		super();
	}

	public ChucVu(String maChucVu, String tenChucVu) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}

	public String getMaChucVu() {
		return maChucVu;
	}

	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	
	
	

}
