package pe.edu.consejo.facultad.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {
	@GetMapping("/home")
	public String index() {
		return "views/admin/home/index.html";
	}
}