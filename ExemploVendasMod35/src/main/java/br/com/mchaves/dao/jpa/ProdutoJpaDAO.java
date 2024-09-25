/**
 * 
 */
package br.com.mchaves.dao.jpa;

import br.com.mchaves.dao.generic.jpa.GenericJpaDAO;
import br.com.mchaves.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
