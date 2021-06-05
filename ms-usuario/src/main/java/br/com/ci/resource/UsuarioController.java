/**
 * 
 */
package br.com.ci.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ci.model.Usuario;
import br.com.ci.service.UsuarioService;

/**
 * @author cbgomes
 *
 */
@RestController
@RequestMapping("/v1/api/empregados")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
