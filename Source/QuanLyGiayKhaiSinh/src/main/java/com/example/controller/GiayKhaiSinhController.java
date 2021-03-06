package com.example.controller;




import java.sql.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.NhanKhau;
import com.example.model.TinhTrangToKhai;
import com.example.model.ToKhai;
import com.example.service.DanTocServiceImpl;
import com.example.service.NhanKhauServiceImpl;
import com.example.service.QuanHeChuHoServiceImpl;
import com.example.service.QuocTichServiceImpl;
import com.example.service.TinhTrangToKhaiServiceImpl;
import com.example.service.ToKhaiServiceImpl;
import com.example.service.TonGiaoServiceImpl;
import com.example.service.XaServiceImpl;

@Controller
public class GiayKhaiSinhController {
	@Autowired
	QuanHeChuHoServiceImpl qhch;
	
	@Autowired
	ToKhaiServiceImpl tk;
	
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
	
	@Autowired
	TinhTrangToKhaiServiceImpl tttk;
	
	
	
	@RequestMapping(value="/DangKyGiayKhaiSinh")
	public String them(Model model){
		
		model.addAttribute("toKhai", new ToKhai());
		model.addAttribute("listToKhai", tk.lietkeToKhai());
		model.addAttribute("listXa", xa.lietkeXa());
		model.addAttribute("listDanToc", dt.lietkeDanToc());
		model.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
		model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		model.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
		
		return "DangKyGiayKhaiSinh";
	}
	
	
	@RequestMapping(value="/xulythem")
	public String xulythem(@Valid ToKhai tokhai, BindingResult result, RedirectAttributes redirect,@RequestParam("cmnd") String ngdk,@RequestParam("cmndcha") String cha,@RequestParam("cmndme") String me, Model model){
		
		try {
			Date today=new Date(System.currentTimeMillis());
//			SimpleDateFormat timeFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
//			String s=timeFormat.format(today.getTime());
			
			
			NhanKhau nguoidk = nk.timNhanKhau(ngdk);
			NhanKhau cha1 = nk.timNhanKhau(cha);
			NhanKhau me1= nk.timNhanKhau(me);
			tokhai.setNgayLap(today);
			tokhai.setClassNhanKhau_Ngdk(nguoidk);
			tokhai.setClassNhanKhau_Cha(cha1);
			tokhai.setClassNhanKhau_Me(me1);
			TinhTrangToKhai tt= new TinhTrangToKhai();
			tt.setMaTinhTrang(1);
			tokhai.setClassTinhTrangToKhai(tt);
			 if (result.hasErrors()) {
					
			        return "DangKyGiayKhaiSinh";
			    }
			tk.them(tokhai);
			redirect.addFlashAttribute("success", "Thêm tờ khai thành công!");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		} catch (Exception e) {
			redirect.addFlashAttribute("success", "Không thành công, đã xãy ra lổi, vui lòng kiểm tra lại các thông tin nhập vào");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		}
		
		
	}

	@RequestMapping(value="/index")
	public String TrangChu(){
		return "TrangChu";
	}
	

	@RequestMapping(value="/XemGiayKhaiSinhChuaDuyet")
	public String DanhSachToKhaiChuaDuyet(Model model){
		String tentinhtrang="Chưa Duyệt";
		model.addAttribute("listToKhai", tk.findGiayKhaiSinhChuaDuyet(tttk.findTen(tentinhtrang)));
		return "XemGiayKhaiSinhChuaDuyet";
	}
	@RequestMapping(value="/XemGiayKhaiSinhDaDuyet")
	public String DanhSachToKhaiDaDuyet(Model model){
		String tentinhtrang="Đã Duyệt";
		model.addAttribute("listToKhai", tk.findGiayKhaiSinhDaDuyet(tttk.findTen(tentinhtrang)));
		return "XemGiayKhaiSinhDaDuyet";
	}
	
	@RequestMapping(value="/XemChiTietGiayKhaiSinh/{id}/xem")
	public String XemChiTietToKhai(@PathVariable String id, Model model){
		
		model.addAttribute("listXa", xa.lietkeXa());
		model.addAttribute("listDanToc", dt.lietkeDanToc());
		model.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
		model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		model.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
		model.addAttribute("toKhai", tk.findOneToKhai(Integer.parseInt(id)));
		return "XemChiTietGiayKhaiSinh";
	}

	@RequestMapping(value="/XemChiTietGiayKhaiSinhDaDuyet/{id}/xem")
	public String XemChiTietToKhaiDaDuyet(@PathVariable String id, Model model){
		
		model.addAttribute("listXa", xa.lietkeXa());
		model.addAttribute("listDanToc", dt.lietkeDanToc());
		model.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
		model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		model.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
		model.addAttribute("toKhai", tk.findOneToKhai(Integer.parseInt(id)));
		return "XemChiTietDaDuyet";
	}

	@RequestMapping(value="/CapNhatGiayKhaiSinh/{id}/")
	public String sua(@PathVariable String id, Model model, Model model1){
		
		
		model1.addAttribute("listXa", xa.lietkeXa());
		model1.addAttribute("listDanToc", dt.lietkeDanToc());
		model1.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model1.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model1.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
		model1.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		model1.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
		model1.addAttribute("listToKhai", tk.lietkeToKhai());
		model.addAttribute("toKhai", tk.findOneToKhai(Integer.parseInt(id)));
		return "CapNhatGiayKhaiSinh";
	}
	
	
	@RequestMapping(value="/xulysua")
	public String xulysua(@Valid ToKhai tokhai, BindingResult result, RedirectAttributes redirect,@RequestParam("cmnd1") String ngdk,@RequestParam("cmndcha1") String cha,@RequestParam("cmndme1") String me, Model model){
		
		try {
			if (result.hasErrors()) {

				return "XemGiayKhaiSinhChuaDuyet";
			}
			NhanKhau nguoidk = nk.timNhanKhau(ngdk);
			NhanKhau cha1 = nk.timNhanKhau(cha);
			NhanKhau me1= nk.timNhanKhau(me);
			//ToKhai tokhai2= tokhai;
			tokhai.setClassNhanKhau_Cha(cha1);
			tokhai.setClassNhanKhau_Me(me1);
			tokhai.setClassNhanKhau_Ngdk(nguoidk);
			tk.sua(tokhai);
			redirect.addFlashAttribute("success", "Sửa thành công!");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		} catch (Exception e) {
			redirect.addFlashAttribute("success", "Sửa không thành công, vui lòng kiểm tra lại!");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		}
	}
	
	@RequestMapping(value="/xulyduyet")
	public String xulyduyet(@Valid ToKhai tokhai, BindingResult result, RedirectAttributes redirect,@RequestParam("cmnd1") String ngdk,@RequestParam("cmndcha1") String cha,@RequestParam("cmndme1") String me, Model model){
		
		try {
			if (result.hasErrors()) {

				return "XemGiayKhaiSinhChuaDuyet";
			}
			TinhTrangToKhai tinhtrang = tttk.findTen("Đã Duyệt");
			tokhai.setClassTinhTrangToKhai(tinhtrang);
			NhanKhau nguoidk = nk.timNhanKhau(ngdk);
			NhanKhau cha1 = nk.timNhanKhau(cha);
			NhanKhau me1= nk.timNhanKhau(me);
			//ToKhai tokhai2= tokhai;
			tokhai.setClassNhanKhau_Cha(cha1);
			tokhai.setClassNhanKhau_Me(me1);
			tokhai.setClassNhanKhau_Ngdk(nguoidk);
			tk.sua(tokhai);
			redirect.addFlashAttribute("success", "Đã duyệt!");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		} catch (Exception e) {
			redirect.addFlashAttribute("success", "Duyệt không thành công, vui lòng kiểm tra lại!");
			return "redirect:/XemGiayKhaiSinhChuaDuyet";
		}
	}
	
	@RequestMapping(value="/duyet/{id}")
	public String Duyet(@PathVariable String id, Model model,RedirectAttributes redirect){
		
		model.addAttribute("listXa", xa.lietkeXa());
		model.addAttribute("listDanToc", dt.lietkeDanToc());
		model.addAttribute("listTonGiao", tg.lietkeTonGiao());
		model.addAttribute("listQuocTich", qt.lietkeQuocTich());
		model.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
		model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
		model.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
		model.addAttribute("toKhai", tk.findOneToKhai(Integer.parseInt(id)));
		redirect.addFlashAttribute("success", "Vui lòng kiểm tra lại thông tin trước khi xác minh!");
		return "Duyet";
	}
	
	 @RequestMapping("/chuaduyet/search")
	    public String search(@RequestParam("q") String q, Model model) {
	        if (q.equals("")) {
	            return "redirect:/XemGiayKhaiSinhChuaDuyet";
	        }
	        
	        model.addAttribute("listToKhai", tk.findName(q));
	        return "XemGiayKhaiSinhChuaDuyet";
	    }
	
	 @RequestMapping("/daduyet/search")
	    public String search2(@RequestParam("q") String q, Model model) {
	        if (q.equals("")) {
	            return "redirect:/XemGiayKhaiSinhDaDuyet";
	        }
	       
	        model.addAttribute("listToKhai", tk.findName(q));
	        return "XemGiayKhaiSinhDaDuyet";
	    }
	 
	 @RequestMapping(value="/XemChiTietGiayKhaiSinh/{id}/in")
		public String InToKhai(@PathVariable String id, Model model){
			
			model.addAttribute("listXa", xa.lietkeXa());
			model.addAttribute("listDanToc", dt.lietkeDanToc());
			model.addAttribute("listTonGiao", tg.lietkeTonGiao());
			model.addAttribute("listQuocTich", qt.lietkeQuocTich());
			model.addAttribute("listQuanHeChuHo",qhch.lietkeQuanHeChuHo());
			model.addAttribute("listNhanKhau",nk.lietkeNhanKhau());
			model.addAttribute("listTinhTrangToKhai", tttk.lietkeTinhTrangToKhai());
			model.addAttribute("toKhai", tk.findOneToKhai(Integer.parseInt(id)));
			return "In";
		}
	
}
