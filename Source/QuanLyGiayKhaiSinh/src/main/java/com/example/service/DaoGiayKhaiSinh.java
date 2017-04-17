package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.GiayKhaiSinh;


@Service
public class DaoGiayKhaiSinh implements GiayKhaiSinhService {
	
	@Autowired
	private GiayKhaiSinhService giaykhaisinhrepository;

	@Override
	public List<GiayKhaiSinh> findAll() {
		// TODO Auto-generated method stub
		return giaykhaisinhrepository.findAll();
	}

	@Override
	public GiayKhaiSinh findOne(int id) {
		// TODO Auto-generated method stub
		return giaykhaisinhrepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		giaykhaisinhrepository.delete(id);
	}

	@Override
	public void save(GiayKhaiSinh gks) {
		// TODO Auto-generated method stub
		giaykhaisinhrepository.save(gks);
	}

	
	

	
	
	
}
