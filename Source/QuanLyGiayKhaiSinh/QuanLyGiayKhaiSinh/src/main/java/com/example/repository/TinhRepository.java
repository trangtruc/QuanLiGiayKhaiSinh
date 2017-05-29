package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Tinh;
@Transactional
public interface TinhRepository extends JpaRepository<Tinh, Integer> {

}
