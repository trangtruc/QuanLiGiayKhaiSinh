package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Xa;
@Transactional
public interface XaRepository extends JpaRepository<Xa, Integer> {

}
