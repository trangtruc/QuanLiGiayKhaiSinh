package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="taikhoancb")
public class TaiKhoan {
	
	@Column(name="id", nullable=false)
	@Id
	private String id;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="macb", nullable=false)
	@ManyToOne
	@JoinColumn(name="taikhoan_canbo_id")
	private CanBo classCanBo;

	public TaiKhoan(String id, String username, String password, CanBo classCanBo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.classCanBo = classCanBo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CanBo getClassCanBo() {
		return classCanBo;
	}

	public void setClassCanBo(CanBo classCanBo) {
		this.classCanBo = classCanBo;
	}
	
	
	
	
}
