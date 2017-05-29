package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.TonGiao;

@Transactional
public interface TonGiaoRepository extends JpaRepository<TonGiao, Integer> {

}
