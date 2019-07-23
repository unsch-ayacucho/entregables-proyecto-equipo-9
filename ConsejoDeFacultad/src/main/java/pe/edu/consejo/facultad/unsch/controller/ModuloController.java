package pe.edu.consejo.facultad.unsch.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.edu.consejo.facultad.unsch.entities.Modulo;
import pe.edu.consejo.facultad.unsch.service.ModuloService;


@Controller



public class ModuloController {
	
	//ADMINISTRADOR
	
	@RequestMapping("/admin/usuarios")
	@GetMapping
	public String mainUsuarios(Model model) {
		model.addAttribute("titulo", "USUARIOS");
		return "views/admin/modulo/usuarios";
	}	
	
	//SECRETARIO
	
	@RequestMapping("/secretario/acta")
	@GetMapping
		public String mainMiembrosSecretario(Model model) {
			model.addAttribute("titulo", "ACTA");
			return "views/secretario/modulo/acta";
		}
	@RequestMapping("/secretario/agenda")
	@GetMapping
		public String mainAgenda(Model model) {
			model.addAttribute("titulo", "AGENDA");
			return "views/secretario/modulo/agenda";
		}
	
	
	//DECANO
	
	@RequestMapping("/decano/sesionordinaria")
	@GetMapping
		public String mainSesionOrdinaria(Model model) {
			model.addAttribute("titulo", "SESION ORDINARIA");
			return "views/decano/modulo/sesionordinaria";
		}
	
	@RequestMapping("/decano/sesionextraordinaria")
	@GetMapping
		public String mainSesionExtraordinaria(Model model) {
			model.addAttribute("titulo", "SESION EXTRAORDINARIA");
			return "views/decano/modulo/sesionextraordinaria";
		}
	
	@RequestMapping("/decano/miembros")
	@GetMapping
		public String mainMiembrosDecano(Model model) {
			model.addAttribute("titulo", "MIEMBROS");
			return "views/decano/modulo/miembros";
		}
	
	@RequestMapping("/decano/listadocumentos")
	@GetMapping
		public String mainSDocumentos(Model model) {
			model.addAttribute("titulo", "LISTA DE DOCUMENTOS");
			return "views/decano/modulo/documentos";
		}

		
}





