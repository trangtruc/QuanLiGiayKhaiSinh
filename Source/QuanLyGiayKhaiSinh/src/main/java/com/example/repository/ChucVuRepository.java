package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ChucVu;
@Transactional
public interface ChucVuRepository extends JpaRepository<ChucVu, Integer> {

}
