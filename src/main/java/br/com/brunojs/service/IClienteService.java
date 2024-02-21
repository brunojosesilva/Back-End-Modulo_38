package br.com.brunojs.service;

import java.util.List;

import br.com.brunojs.domain.Cliente;
import br.com.brunojs.exceptions.DAOException;
import br.com.brunojs.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
