package pe.edu.consejo.facultad.unsch.dao;

import java.util.List;

import pe.edu.consejo.facultad.unsch.entities.Submodulo;

public interface SubmoduloDao {
	
	public List<Submodulo> listarPorPerfil(String usuario);

}
