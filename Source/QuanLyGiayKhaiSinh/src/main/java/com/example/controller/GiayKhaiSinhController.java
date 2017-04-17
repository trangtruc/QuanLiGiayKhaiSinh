package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/giaykhaisinh")
public class GiayKhaiSinhController {
	
	@RequestMapping(value="/DangKyKhaiSinh")
	public String dangky(){
		
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
	
	@RequestMapping(value="/List")
	public String listkhaisinh(){
		
		return "ListKhaiSinh";
	}
	
	@RequestMapping(value="/DangNhapCB")
	public String DangNhapCB(){
		return "DangNhapCanBo";
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
