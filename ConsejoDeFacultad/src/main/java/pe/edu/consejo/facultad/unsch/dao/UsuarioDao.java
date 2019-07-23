package pe.edu.consejo.facultad.unsch.dao;

import pe.edu.consejo.facultad.unsch.entities.Usuario;

public interface UsuarioDao {
	public Usuario login(String usuario, String password); 
	
}
