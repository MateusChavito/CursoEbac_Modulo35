/**
 * 
 */
package br.com.mchaves.services;

import br.com.mchaves.domain.Cliente;
import br.com.mchaves.exceptions.DAOException;
import br.com.mchaves.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
