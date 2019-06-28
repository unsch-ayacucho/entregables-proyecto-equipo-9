package pe.edu.consejo.facultad.unsch.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.consejo.facultad.unsch.dao.UsuarioDao;
import pe.edu.consejo.facultad.unsch.entities.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;
	@Override
	public Usuario login(String usuario, String password) {
	return usuarioDao.login(usuario, password);
	}

}
