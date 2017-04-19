package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.QuanHeChuHo;
import com.example.repository.QuanHeChuHoRepository;

@Service
public class QuanHeChuHoServiceImpl {
	@Autowired
	QuanHeChuHoRepository qh;
	public List<QuanHeChuHo> lietkeQuanHeChuHo() {

		return qh.findAll();
	}

}
