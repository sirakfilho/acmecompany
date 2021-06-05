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

import br.com.ci.model.Conta;
import br.com.ci.service.ContaService;

/**
 * @author cbgomes
 *
 */
@RestController
@RequestMapping("/v1/api/empregados")
public class ContaController {

	@Autowired
	private ContaService service;
	
	
	@GetMapping
	public ResponseEntity<List<Conta>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
