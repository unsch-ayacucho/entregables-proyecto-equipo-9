package pe.edu.consejo.facultad.unsch.service;

import java.util.List;

import pe.edu.consejo.facultad.unsch.entities.Submodulo;

public interface SubmoduloService {
	
	public List<Submodulo> listarPorPerfil(String usuario);

}
