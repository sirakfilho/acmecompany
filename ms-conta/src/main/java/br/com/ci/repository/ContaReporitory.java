/**
 * 
 */
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Conta;

/**
 * @author cbgomes
 *
 */
@Repository
public interface ContaReporitory extends JpaRepository<Conta, Long> {

}
