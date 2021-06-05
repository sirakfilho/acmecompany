/**
 * 
 */
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Conta;
import br.com.ci.repository.ContaReporitory;

/**
 * @author cbgomes
 *
 */
@Service
public class ContaService {

	@Autowired
	private ContaReporitory reporitory;
	
	public List<Conta> lista(){
		return this.reporitory.findAll();
	}
	
}
