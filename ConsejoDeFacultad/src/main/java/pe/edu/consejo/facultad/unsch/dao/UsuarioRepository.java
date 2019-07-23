package pe.edu.consejo.facultad.unsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.consejo.facultad.unsch.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsuario(String usuario);

}
