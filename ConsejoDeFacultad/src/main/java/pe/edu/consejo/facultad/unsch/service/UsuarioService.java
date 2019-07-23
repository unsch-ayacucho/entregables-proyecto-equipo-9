package pe.edu.consejo.facultad.unsch.service;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.consejo.facultad.unsch.entities.Usuario;

public interface UsuarioService {
	public Usuario login(String usuario, String password);
	
	
}
