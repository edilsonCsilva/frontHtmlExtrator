package analisticsdata.extractor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthController {

	@GetMapping(value = "/")
	String Auth() {
		return "auth/auth.html";
	}
}
