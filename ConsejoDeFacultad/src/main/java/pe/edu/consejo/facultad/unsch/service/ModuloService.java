package pe.edu.consejo.facultad.unsch.service;

import java.util.List;

import pe.edu.consejo.facultad.unsch.entities.Modulo;

public interface ModuloService {
	
	public List<Modulo> listarPorPerfil(String usuario);
	
}
