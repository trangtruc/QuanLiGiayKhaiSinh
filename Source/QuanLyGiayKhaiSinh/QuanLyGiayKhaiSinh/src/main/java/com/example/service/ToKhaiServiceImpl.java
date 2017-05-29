package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.TinhTrangToKhai;
import com.example.model.ToKhai;
import com.example.repository.ToKhaiRepository;
@Service
public class ToKhaiServiceImpl  {
	@Autowired
	ToKhaiRepository tk;

	public Iterable<ToKhai> lietkeToKhai(){
		
		 return tk.findAll();
	}
	public void them(ToKhai k){
		
		 tk.save(k);
	}
	
	public void xoa(int id){
		
		 tk.delete(id);
	}
	
	public ToKhai findOneToKhai(int  id){
		
		return tk.findOne(id);
	}
	
	public Iterable<ToKhai> findGiayKhaiSinhChuaDuyet(TinhTrangToKhai tinhtrang){
		
		return tk.findByClassTinhTrangToKhai(tinhtrang);
	}

	
	public Iterable<ToKhai> findName(String name){
		return tk.findByHoTenNguoiKS(name);
	}
	
	public Iterable<ToKhai> findGiayKhaiSinhDaDuyet(TinhTrangToKhai tinhtrang) {

		return tk.findByClassTinhTrangToKhai(tinhtrang);
	}
	public void sua(ToKhai  tokhai){
		
		ToKhai temp= tk.findOne(tokhai.getMaToKhai());
		temp.setClassDanToc(tokhai.getClassDanToc());
		temp.setClassNhanKhau_Cha(tokhai.getClassNhanKhau_Cha());
		temp.setClassNhanKhau_Me(tokhai.getClassNhanKhau_Me());
		temp.setClassNhanKhau_Ngdk(tokhai.getClassNhanKhau_Ngdk());
		temp.setClassQuanHeVoiNgDK(tokhai.getClassQuanHeVoiNgDK());
		temp.setClassQuocTich(tokhai.getClassQuocTich());
		temp.setClassTinhTrangToKhai(tokhai.getClassTinhTrangToKhai());
		temp.setClassTonGiao(tokhai.getClassTonGiao());
		temp.setClassXa(tokhai.getClassXa());
		temp.setClassXa2(tokhai.getClassXa2());
		temp.setGhiChu(tokhai.getGhiChu());
		temp.setGioiTinh(tokhai.getGioiTinh());
		temp.setHoTenNguoiKS(tokhai.getHoTenNguoiKS());
		temp.setNgayLap(tokhai.getNgayLap());
		temp.setNgaySinh(tokhai.getNgaySinh());
		temp.setNgaySinhBC(tokhai.getNgaySinhBC());
		temp.setNoiSinh(tokhai.getNoiSinh());

		tk.save(temp);
		
	}
	
	
	
	
	
}
