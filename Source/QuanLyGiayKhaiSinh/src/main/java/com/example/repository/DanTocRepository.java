package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DanToc;

@Transactional
public interface DanTocRepository extends JpaRepository<DanToc, Integer> {

}
