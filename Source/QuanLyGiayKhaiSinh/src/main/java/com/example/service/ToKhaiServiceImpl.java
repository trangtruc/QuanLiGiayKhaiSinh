package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.ToKhai;
import com.example.repository.ToKhaiRepository;
import java.util.List;
@Service
public class ToKhaiServiceImpl {
	@Autowired
	ToKhaiRepository tk;
	
	
	public List<ToKhai> lietkeToKhai(){
		
		 return tk.findAll();
	}
	public void them(ToKhai k){
		
		 tk.save(k);
	}
	
	public void xoa(int id){
		
		 tk.delete(id);
	}
	
	public ToKhai findOneGiayKhaiSinh(int  id){
		
		return tk.findOne(id);
	}
	
	public void sua(ToKhai k){
		
		
	}

}
