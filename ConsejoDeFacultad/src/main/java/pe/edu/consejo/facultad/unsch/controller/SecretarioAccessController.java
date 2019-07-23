package pe.edu.consejo.facultad.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secretario")
public class SecretarioAccessController {
	@GetMapping("/home")
	public String index() {
		return "views/secretario/home/index";
	}
}