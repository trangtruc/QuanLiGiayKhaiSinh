package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.SoHoKhau;
@Transactional
public interface SoHoKhauRepository extends JpaRepository<SoHoKhau, Integer> {

}
