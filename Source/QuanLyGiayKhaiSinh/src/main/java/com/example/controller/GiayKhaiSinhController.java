package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.GiayKhaiSinh;
import com.example.service.DaoGiayKhaiSinh;

@Controller
@RequestMapping(value="/giaykhaisinh")
public class GiayKhaiSinhController {
	
	@Autowired
	private DaoGiayKhaiSinh gks;
	
	
	@RequestMapping(value="/DangKyKhaiSinh")
	public String dangky(Model model){
		model.addAttribute("dangkygiaykhaisinh", new GiayKhaiSinh());
		return "DangKyGiayKhaiSinh";
	}
	
	@RequestMapping(value="/CapLaiKhaiSinh")
	public String caplai(){
		
		
		return "CapLaiGiayKhaiSinh";
	}
	
	@RequestMapping(value="/CapNhatKhaiSinh")
	public String capnhat(){
		
		return "CapNhatGiayKhaiSinh";
	}
	
	@RequestMapping(value="/list")
	public String listkhaisinh(Model model){
		
		model.addAttribute("danhsachgiaykhaisinh", gks.findAll());
		return "ListKhaiSinh";
	}
	
	
	
	@RequestMapping(value="/index")
	public String TrangChu(){
		return "TrangChu";
	}
	
	@RequestMapping(value="/XemGiayKSChuaDuyet")
	public String XemGiayKhaiSinhChuaDuyet(){
		return "XemGiayKhaiSinhChuaDuyet";
	}
	
	@RequestMapping(value="/XemGiayKSDaDuyet")
	public String XemGiayKhaiSinhDaDuyet(){
		return "XemGiayKhaiSinhDaDuyet";
	}
	
	@RequestMapping(value="/XemChiTietKhaiSinh")
	public String XemChiTietGiayKhaiSinh(){
		return "XemChiTietGiayKhaiSinh";
	}
	

}
