package model;
import javax.persistence.*;

@Entity
@Table(name="tinh")
public class Tinh {
	
	@Column(name="matinh",nullable=false)
	@Id
	private String maTinh;
	
	@Column(name="tentinh",nullable=false)
	private String tenTinh;
	
	public Tinh() {
		super();
	}

	public Tinh(String maTinh, String tenTinh) {
		super();
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	public String getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	
	
	

}
