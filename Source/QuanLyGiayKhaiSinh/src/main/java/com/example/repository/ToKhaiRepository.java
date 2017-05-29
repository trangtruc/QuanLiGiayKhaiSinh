package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.model.TinhTrangToKhai;
import com.example.model.ToKhai;

@Transactional
public interface ToKhaiRepository extends CrudRepository<ToKhai, Integer>{

	List<ToKhai> findByClassTinhTrangToKhai(TinhTrangToKhai tentinhtrang);	

	List<ToKhai> findByHoTenNguoiKS(String name);
	
	
	
}
