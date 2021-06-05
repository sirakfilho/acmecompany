/**
 * 
 */
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Usuario;

/**
 * @author cbgomes
 *
 */
@Repository
public interface UsuarioReporitory extends JpaRepository<Usuario, Long> {

}
