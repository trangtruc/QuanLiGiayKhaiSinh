package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.GiayKhaiSinh;

public interface GiayKhaiSinhRepository extends JpaRepository<GiayKhaiSinh, Integer> {
	
	List<GiayKhaiSinh> findAllGiayKhaiSinh();
}
