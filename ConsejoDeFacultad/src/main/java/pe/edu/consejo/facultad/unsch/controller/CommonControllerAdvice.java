package pe.edu.consejo.facultad.unsch.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import pe.edu.consejo.facultad.unsch.dao.UsuarioRepository;
import pe.edu.consejo.facultad.unsch.entities.Perfil;
import pe.edu.consejo.facultad.unsch.entities.Usuario;
import pe.edu.consejo.facultad.unsch.entities.UsuarioPerfil;
import pe.edu.consejo.facultad.unsch.service.ModuloService;
import pe.edu.consejo.facultad.unsch.service.SubmoduloService;
import pe.edu.consejo.facultad.unsch.service.UsuarioService;

@ControllerAdvice
public class CommonControllerAdvice {
	

	@Autowired
	private ModuloService moduloService;
	
	@Autowired
	private SubmoduloService submoduloService;
	

	
	@ModelAttribute
	public void addAttributes(HttpServletRequest request, Model model) {
		//Recuperacion de session
		
		/*HttpSession session = request.getSession();
	    String usuario = (String) session.getAttribute("usuario");*/
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
				
		if (auth != null) {
			String usuario = auth.getName();
			
			
	      	 if (usuario != null) {

				// Nombre de usuario
	      		//model.addAttribute("nombreUsuario", usuarioRepository.findByUsuario(usuario).getNombre());
		        
	      		 // Tipo de usuario
				model.addAttribute("usuario", usuario);
		    	
				// Modulos de usuario activo 
				model.addAttribute("modulosPorPerfil", moduloService.listarPorPerfil(usuario));    
							
				// Submodulos de usuario activo
				model.addAttribute("submodulosPorPerfil", submoduloService.listarPorPerfil(usuario));
			}
		}
	}

}
