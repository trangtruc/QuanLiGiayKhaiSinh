package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.DanToc;
import com.example.repository.DanTocRepository;

@Service
public class DanTocServiceImpl {
	
	@Autowired
	DanTocRepository dt;
	
	public List<DanToc> lietkeDanToc() {

		return dt.findAll();
		
	}
	

}
