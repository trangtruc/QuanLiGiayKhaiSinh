package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Tinh;
import com.example.repository.TinhRepository;

@Service
public class TinhServiceImpl {
	@Autowired
	TinhRepository tinh;
	
	public void them(Tinh k){
		
		 tinh.save(k);
	}

}
