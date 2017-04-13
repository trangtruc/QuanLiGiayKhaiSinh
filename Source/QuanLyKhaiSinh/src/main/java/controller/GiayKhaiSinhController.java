package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/giaykhaisinh")
public class GiayKhaiSinhController {
	@RequestMapping(value="/dangky")
	public String dangky(){
		
		return "DangKyGiayKhaiSinh";
	}
	@RequestMapping(value="/caplai")
	public String caplai(){
		
		return "CapLaiGiayKhaiSinh";
	}
	@RequestMapping(value="/capnhat")
	public String capnhat(){
		
		return "CapNhatGiayKhaiSinh";
	}
	@RequestMapping(value="/list")
	public String listkhaisinh(){
		
		return "ListKhaiSinh";
	}
	

}
