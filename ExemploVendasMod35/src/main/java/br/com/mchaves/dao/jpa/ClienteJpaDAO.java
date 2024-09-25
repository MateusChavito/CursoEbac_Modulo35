/**
 * 
 */
package br.com.mchaves.dao.jpa;

import br.com.mchaves.dao.generic.jpa.GenericJpaDAO;
import br.com.mchaves.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
