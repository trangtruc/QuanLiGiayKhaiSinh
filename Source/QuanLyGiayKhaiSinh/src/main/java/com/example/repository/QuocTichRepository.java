package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.QuocTich;
@Transactional
public interface QuocTichRepository extends JpaRepository<QuocTich, Integer> {

}
