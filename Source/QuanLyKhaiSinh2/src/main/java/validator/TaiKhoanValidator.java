package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import model.TaiKhoan;
import service.TaiKhoanService;

@Component
public class TaiKhoanValidator implements Validator{

	@Autowired
	private TaiKhoanService taikhoanService;
	
	@Override
	public boolean supports(Class<?> aClass) {
		return TaiKhoan.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		TaiKhoan taikhoan = (TaiKhoan)o;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (taikhoan.getUsername().length() < 6 || taikhoan.getUsername().length() > 32){
			errors.rejectValue("username", "Size.userForm.username");
		}
		if (taikhoanService.findByUsername(taikhoan.getUsername()) != null){
			errors.rejectValue("username", "Duplicate.userForm.username");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (taikhoan.getPassword().length() <8 || taikhoan.getPassword().length() > 32){
			errors.rejectValue("password", "Size.userForm.password");
		}
	}

}
