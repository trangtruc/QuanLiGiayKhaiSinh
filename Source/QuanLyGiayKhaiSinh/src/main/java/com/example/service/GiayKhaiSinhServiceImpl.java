package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.GiayKhaiSinh;
import com.example.repository.GiayKhaiSinhRepository;



@Service
public class GiayKhaiSinhServiceImpl {

	@Autowired
	GiayKhaiSinhRepository gks;
	public void them(GiayKhaiSinh ks){
		
		 gks.save(ks);
	}
	
	public void xoa(int id){
		
		 gks.delete(id);
	}
	
	public GiayKhaiSinh findOneGiayKhaiSinh(int  id){
		
		return gks.findOne(id);
	}
	
	public void sua(GiayKhaiSinh ks){
		
		GiayKhaiSinh temp= gks.findOne(ks.getSoKhaiSinh());
		temp.setNgayCap(ks.getNgayCap());
		temp.setGhiChu(ks.getGhiChu());
		temp.setClassToKhai(ks.getClassToKhai());
		gks.save(temp);
	}
	
	
}
