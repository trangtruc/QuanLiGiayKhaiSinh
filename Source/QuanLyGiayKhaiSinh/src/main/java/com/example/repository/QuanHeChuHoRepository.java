package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.QuanHeChuHo;
@Transactional
public interface QuanHeChuHoRepository extends JpaRepository<QuanHeChuHo, Integer> {

}
