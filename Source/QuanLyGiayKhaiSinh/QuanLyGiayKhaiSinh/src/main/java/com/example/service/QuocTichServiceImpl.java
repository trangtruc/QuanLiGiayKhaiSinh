package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.QuocTich;
import com.example.repository.QuocTichRepository;

@Service
public class QuocTichServiceImpl {
	@Autowired
	QuocTichRepository qt;
	public List<QuocTich> lietkeQuocTich() {

		return qt.findAll();
	}

}
