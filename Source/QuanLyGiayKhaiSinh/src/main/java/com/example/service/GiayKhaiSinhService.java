package com.example.service;

import java.util.List;

import com.example.model.GiayKhaiSinh;

public interface GiayKhaiSinhService {
	List<GiayKhaiSinh> findAll();
	GiayKhaiSinh findOne(int id);
	void delete(int id);
	void save (GiayKhaiSinh gks);

}
