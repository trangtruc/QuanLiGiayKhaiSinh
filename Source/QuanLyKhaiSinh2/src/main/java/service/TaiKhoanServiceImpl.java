package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.TaiKhoan;
import repository.TaiKhoanRepository;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService{

	@Autowired
	private TaiKhoanRepository taikhoanRepository;
	
	@Override
	public TaiKhoan findByUsername(String username) {
		return taikhoanRepository.findByUsername(username);
	}

}
