package pe.edu.consejo.facultad.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Error403Controller {
	
	@GetMapping("/403")
	public String error403(Model model) {
		model.addAttribute("titulo", "Acceso denegado");
		return "views/error/403";
	}

}
