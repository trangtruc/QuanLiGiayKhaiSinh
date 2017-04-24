package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.NhanKhau;
import com.example.repository.NhanKhauRepository;

@Service
public class NhanKhauServiceImpl {
	
	@Autowired
	NhanKhauRepository nk;
	
	public List<NhanKhau> lietkeNhanKhau(){
		
		return nk.findAll();
	}
	
	

}
