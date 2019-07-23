package pe.edu.consejo.facultad.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.consejo.facultad.unsch.dao.ModuloDao;
import pe.edu.consejo.facultad.unsch.entities.Modulo;

@Service("moduloService")
@Transactional
public class ModuloServiceImpl implements ModuloService {
	
	@Autowired
	private ModuloDao moduloDao;

	@Override
	public List<Modulo> listarPorPerfil(String usuario) {
		return moduloDao.listarPorPerfil(usuario);
	}



}
