package service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.GrantedAuthority;

import java.lang.Iterable;
import model.CanBo;
import model.TaiKhoan;
import repository.TaiKhoanRepository;

@Service
public class TaiKhoanDetailsServiceImpl implements TaiKhoanDetailsService{

	@Autowired
	private TaiKhoanRepository taikhoanRepository;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		TaiKhoan taikhoan = taikhoanRepository.findByUsername(username);
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		CanBo canbo = taikhoan.getClassCanBo();
		grantedAuthorities.add(new SimpleGrantedAuthority(canbo.getMaCanBo()));
		
		return new org.springframework.security.core.userdetails.User(taikhoan.getUsername(), taikhoan.getPassword(), grantedAuthorities);
	}

}
