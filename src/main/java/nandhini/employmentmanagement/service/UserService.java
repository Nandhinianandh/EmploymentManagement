package nandhini.employmentmanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import nandhini.employmentmanagement.dto.UserRegistrationDto;
import nandhini.employmentmanagement.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
