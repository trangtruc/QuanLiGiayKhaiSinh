package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;
	@Column(name = "hoten")
	@NotEmpty(message = "*Please provide your last name")
	private String Name;
	@Column(name = "active")
	private int active;
	@Column(name = "ngaysinh")
	private Date ngaySinh;
	@Column(name = "dienthoai")
	private String soDienThoai;
	
	@ManyToOne
	@JoinColumn(name="user_xa_id")
	private Xa classXa;
	
	@ManyToOne
	@JoinColumn(name="user_cv_id")
	private ChucVu classChucVu;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	

	public User() {
		super();
	}

	public User(String email, String password, String name, int active, Date ngaySinh, String soDienThoai, Xa classXa,
			ChucVu classChucVu, Set<Role> roles) {
		super();
		this.email = email;
		this.password = password;
		Name = name;
		this.active = active;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.classXa = classXa;
		this.classChucVu = classChucVu;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Xa getClassXa() {
		return classXa;
	}

	public void setClassXa(Xa classXa) {
		this.classXa = classXa;
	}

	public ChucVu getClassChucVu() {
		return classChucVu;
	}

	public void setClassChucVu(ChucVu classChucVu) {
		this.classChucVu = classChucVu;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	


}