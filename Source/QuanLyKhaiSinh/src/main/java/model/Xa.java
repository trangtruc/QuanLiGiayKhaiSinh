package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="xa")
public class Xa {
	private String maXa;
	private String tenXa;
	private Huyen classHuyen;
	private List<NhanKhau> listNhanKhau;
	private List<CanBo> listCanBo;
	private List<ToKhai> listToKhai_NoiDK;
	private List<ToKhai> listToKhai_DCTT;
	private List<SoHoKau> listSoHoKau;
	
	public Xa() {
		super();
	}

	public Xa(String maXa, String tenXa, Huyen classHuyen, List<NhanKhau> listNhanKhau, List<CanBo> listCanBo,
			List<ToKhai> listToKhai_NoiDK, List<ToKhai> listToKhai_DCTT, List<SoHoKau> listSoHoKau) {
		super();
		this.maXa = maXa;
		this.tenXa = tenXa;
		this.classHuyen = classHuyen;
		this.listNhanKhau = listNhanKhau;
		this.listCanBo = listCanBo;
		this.listToKhai_NoiDK = listToKhai_NoiDK;
		this.listToKhai_DCTT = listToKhai_DCTT;
		this.listSoHoKau = listSoHoKau;
	}

	public String getMaXa() {
		return maXa;
	}

	public void setMaXa(String maXa) {
		this.maXa = maXa;
	}

	@Id
	public String getTenXa() {
		return tenXa;
	}

	public void setTenXa(String tenXa) {
		this.tenXa = tenXa;
	}

	@ManyToOne
	@JoinColumn(name="huyen_id")
	public Huyen getClassHuyen() {
		return classHuyen;
	}

	public void setClassHuyen(Huyen classHuyen) {
		this.classHuyen = classHuyen;
	}

	public List<NhanKhau> getListNhanKhau() {
		return listNhanKhau;
	}
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	public void setListNhanKhau(List<NhanKhau> listNhanKhau) {
		this.listNhanKhau = listNhanKhau;
	}

	public List<CanBo> getListCanBo() {
		return listCanBo;
	}
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	public void setListCanBo(List<CanBo> listCanBo) {
		this.listCanBo = listCanBo;
	}

	public List<ToKhai> getListToKhai_NoiDK() {
		return listToKhai_NoiDK;
	}
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	public void setListToKhai_NoiDK(List<ToKhai> listToKhai_NoiDK) {
		this.listToKhai_NoiDK = listToKhai_NoiDK;
	}

	public List<ToKhai> getListToKhai_DCTT() {
		return listToKhai_DCTT;
	}
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	public void setListToKhai_DCTT(List<ToKhai> listToKhai_DCTT) {
		this.listToKhai_DCTT = listToKhai_DCTT;
	}

	public List<SoHoKau> getListSoHoKau() {
		return listSoHoKau;
	}
	@OneToMany(mappedBy = "classXa", cascade = CascadeType.ALL)
	public void setListSoHoKau(List<SoHoKau> listSoHoKau) {
		this.listSoHoKau = listSoHoKau;
	}
	
	
	
	

}
