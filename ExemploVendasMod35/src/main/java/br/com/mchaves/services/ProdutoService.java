/**
 * 
 */
package br.com.mchaves.services;

import br.com.mchaves.dao.IProdutoDAO;
import br.com.mchaves.domain.Produto;
import br.com.mchaves.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
