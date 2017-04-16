package service;

import org.springframework.security.core.userdetails.UserDetails;

public interface TaiKhoanDetailsService {
	UserDetails loadUserByUsername(String username);
}
