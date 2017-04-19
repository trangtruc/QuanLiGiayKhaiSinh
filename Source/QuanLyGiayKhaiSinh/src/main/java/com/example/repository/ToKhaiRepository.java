package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ToKhai;

@Transactional
public interface ToKhaiRepository extends JpaRepository<ToKhai, Integer>{

}
