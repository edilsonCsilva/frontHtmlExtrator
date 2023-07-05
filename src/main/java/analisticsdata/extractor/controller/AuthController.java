package analisticsdata.extractor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import analisticsdata.extractor.dtos.ClientDto;

@Controller
public class AuthController {

	@GetMapping(value = "/Auth")
	String Auth() {
		return "auth/auth.html";
	}
	
	@PostMapping(value="/validateclient")
	void validateClient(ClientDto clientDto) {
		System.out.println(clientDto.getCpf());
	}
}
