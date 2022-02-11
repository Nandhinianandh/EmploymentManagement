package nandhini.employmentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	/*
	 * @GetMapping("/") public String home() { return "index"; }
	 */
	@PostMapping("/employeelogin")
	public String employeelogin() {
		return "employeelogin";
	}

	@GetMapping("/details")
	public String details()
	{
		return "details";
	}
}
