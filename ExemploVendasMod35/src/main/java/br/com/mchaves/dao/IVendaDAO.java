/**
 * 
 */
package br.com.mchaves.dao;

import br.com.mchaves.dao.generic.IGenericDAO;
import br.com.mchaves.domain.Venda;
import br.com.mchaves.exceptions.DAOException;
import br.com.mchaves.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
