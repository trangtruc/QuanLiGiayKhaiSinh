package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService{

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired 
	private TaiKhoanService taikhoanService;
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	@Override
	public String findLoggedInUsername() {
		Object taikhoanDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if (taikhoanDetails instanceof UserDetails){
			return ((UserDetails)taikhoanDetails).getUsername();
		}
		
		return null;
	}

	@Override
	public void autologin(String username, String password) {
		UserDetails taikhoanDetails = taikhoanService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(taikhoanDetails,  password, taikhoanDetails.getAuthorities());
		
		authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		
		if (usernamePasswordAuthenticationToken.isAuthenticated()){
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			logger.debug(String.format("Auto login %s successfully", username));
		}
	}

}
