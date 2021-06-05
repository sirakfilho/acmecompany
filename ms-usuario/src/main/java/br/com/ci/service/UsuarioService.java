/**
 * 
 */
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Usuario;
import br.com.ci.repository.UsuarioReporitory;

/**
 * @author cbgomes
 *
 */
@Service
public class UsuarioService {

	@Autowired
	private UsuarioReporitory reporitory;
	
	public List<Usuario> lista(){
		return this.reporitory.findAll();
	}
	
}
