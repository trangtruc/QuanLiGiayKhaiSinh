package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Xa;
import com.example.repository.XaRepository;
@Service
public class XaServiceImpl {
	@Autowired
	XaRepository xa;
	public List<Xa> lietkeXa(){
		
		 return xa.findAll();
	}

}
