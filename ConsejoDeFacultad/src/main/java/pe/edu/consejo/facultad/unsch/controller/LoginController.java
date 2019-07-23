package pe.edu.consejo.facultad.unsch.controller;
/*
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.consejo.facultad.unsch.entities.Usuario;
import pe.edu.consejo.facultad.unsch.service.ModuloService;
import pe.edu.consejo.facultad.unsch.service.UsuarioService;
import pe.edu.consejo.facultad.unsch.service.SubmoduloService;*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "/views/login/login";
	}
	
	/*
	@Autowired
	private UsuarioService usuarioService;

	
	@Autowired
	private ModuloService moduloService;
	
	@Autowired
	private SubmoduloService submoduloService;

	
	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpSession session, Model model) {
		model.addAttribute("user", new Usuario());
		Usuario user = this.usuarioService.login(request.getParameter("username"), request.getParameter("password"));
			
		if (user == null) {
			model.addAttribute("error", "Cuenta  inválida");
			return "redirect:/login";
		} else {
			session.setAttribute("usuario", user.getNombre());
			
		
			session.setAttribute("modulosPorPerfil", moduloService.listarPorPerfil(user.getUsuario()));    
			
		
			session.setAttribute("submodulosPorPerfil", submoduloService.listarPorPerfil(user.getUsuario()));
			
			return "redirect:/admin/home"; 
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("usuario");
		session.removeAttribute("modulosPorPerfil");
		session.removeAttribute("submodulosPorPerfil");
		return "redirect:/login";
	}*/
}
