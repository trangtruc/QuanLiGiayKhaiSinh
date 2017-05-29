package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.data.repository.CrudRepository;

import com.example.model.NhanKhau;



@Transactional
public interface NhanKhauRepository   extends CrudRepository<NhanKhau, Integer>{
	
	
	NhanKhau findByCmnd (String id);
	
}
