package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.NhanKhau;
@Transactional
public interface NhanKhauRepository extends JpaRepository<NhanKhau, Integer>{

}
