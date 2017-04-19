package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.GiayKhaiSinh;
import com.example.model.ToKhai;
import com.example.service.DanTocServiceImpl;
import com.example.service.GiayKhaiSinhServiceImpl;
import com.example.service.NhanKhauServiceImpl;
import com.example.service.QuanHeChuHoServiceImpl;
import com.example.service.QuocTichServiceImpl;
import com.example.service.ToKhaiServiceImpl;
import com.example.service.TonGiaoServiceImpl;
import com.example.service.XaServiceImpl;


@Controller
@RequestMapping(value="/giaykhaisinh")
public class GiayKhaiSinhController {

	@Autowired
	QuanHeChuHoServiceImpl qh;
	
	@Autowired
	ToKhaiServiceImpl tkh;
	
	@Autowired
	XaServiceImpl xa;
	
	@Autowired
	DanTocServiceImpl dt;
	
	@Autowired
	TonGiaoServiceImpl tg;
	
	@Autowired
	QuocTichServiceImpl qt;
	
	@Autowired
	NhanKhauServiceImpl nk;
	
	
	@RequestMapping(value="/DangKyGiayKhaiSinh")
	public String them(Model model){
		
		model.addAttribute("toKhai", new ToKhai());
		model.addAttribute("listXa", xa.lietkeXa());
		model.addAttribute("listDanToc", dt.lietkeDanToc());
		model.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model.addAttribute("listQuanHeChuHo",qh.lietkeQuanHeChuHo());
		model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		
		return "DangKyGiayKhaiSinh";
	}
	
	
	@RequestMapping(value="/xulythem")
	public String xulythem(@Valid ToKhai tk, BindingResult result, RedirectAttributes redirect){
		if (result.hasErrors()) {
			return "DangKyGiayKhaiSinh";
		}
		tkh.them(tk);
		redirect.addFlashAttribute("success", "successfully!");
		return "redirect:/giaykhaisinh/DangKyGiayKhaiSinh";
	}
	
	
	@RequestMapping(value="/CapLaiKhaiSinh")
	public String caplai(){
		
		
		return "CapLaiGiayKhaiSinh";
	}
	
	@RequestMapping(value="/CapNhatKhaiSinh")
	public String capnhat(){
		
		return "CapNhatGiayKhaiSinh";
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
