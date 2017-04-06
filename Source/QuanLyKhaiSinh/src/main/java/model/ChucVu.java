package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="chucvu")
public class ChucVu {
	private String maChucVu;
	private String tenChucVu;
	private List<CanBo> listCanBo;
	public ChucVu() {
		super();
	}
	public ChucVu(String maChucVu, String tenChucVu, List<CanBo> listCanBo) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.listCanBo = listCanBo;
	}
	@Id
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
	public List<CanBo> getListCanBo() {
		return listCanBo;
	}
	@OneToMany(mappedBy = "classChucVu", cascade = CascadeType.ALL)
	public void setListCanBo(List<CanBo> listCanBo) {
		this.listCanBo = listCanBo;
	}
	
	

}
