package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Huyen;
@Transactional
public interface HuyenRepository extends JpaRepository<Huyen, Integer> {

}
