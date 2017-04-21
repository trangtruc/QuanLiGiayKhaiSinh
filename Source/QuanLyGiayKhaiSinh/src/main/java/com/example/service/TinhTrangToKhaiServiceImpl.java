package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.TinhTrangToKhai;
import com.example.repository.TinhTrangToKhaiRepository;

@Service
public class TinhTrangToKhaiServiceImpl {
	
	@Autowired
	TinhTrangToKhaiRepository tttk;
	
	public List<TinhTrangToKhai> lietkeTinhTrangToKhai(){
		
		 return tttk.findAll();
	}

}