package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.TonGiao;
import com.example.repository.TonGiaoRepository;
@Service
public class TonGiaoServiceImpl {
	@Autowired
	TonGiaoRepository tg;

	public List<TonGiao> lietkeTonGiao() {

		return tg.findAll();
	}
}
