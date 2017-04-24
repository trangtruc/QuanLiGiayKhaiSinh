package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.TinhTrangToKhai;

@Transactional
public interface TinhTrangToKhaiRepository extends JpaRepository<TinhTrangToKhai, Integer> {

	TinhTrangToKhai findByTenTinhTrang(String ten);
}
