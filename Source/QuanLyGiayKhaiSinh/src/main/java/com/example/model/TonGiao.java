package com.example.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tongiao")
public class TonGiao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="matongiao",nullable=false)	
	private int maTonGiao;
	
	@Column(name="tentongiao",nullable=false)
	private String tenTonGiao;
	
	@OneToMany(mappedBy = "classTonGiao", cascade = CascadeType.ALL)
	@Column(name="matk",nullable=false)
	private List<ToKhai> listToKhai;
	
	@OneToMany(mappedBy = "classTonGiao", cascade = CascadeType.ALL)
	private List<NhanKhau> listNhanKhau;

	public TonGiao() {
		super();
	}

	public TonGiao(String tenTonGiao, List<ToKhai> listToKhai, List<NhanKhau> listNhanKhau) {
		super();
		this.tenTonGiao = tenTonGiao;
		this.listToKhai = listToKhai;
		this.listNhanKhau = listNhanKhau;
	}
	
	
}
