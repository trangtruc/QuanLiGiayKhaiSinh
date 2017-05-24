package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.NhanKhau;
import com.example.repository.NhanKhauRepository;

@Service
public class NhanKhauServiceImpl {
	
	@Autowired
	NhanKhauRepository nk;
	
	public Iterable<NhanKhau> lietkeNhanKhau(){
		
		return nk.findAll();
	}
	
	public NhanKhau timNhanKhau(String id){
		return nk.findByCmnd(id);
	}
	
	

}
