package br.com.brunojs.service;

import java.util.Collection;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.brunojs.dao.IClienteDAO;
import br.com.brunojs.domain.Cliente;
import br.com.brunojs.exceptions.DAOException;
import br.com.brunojs.exceptions.MaisDeUmRegistroException;
import br.com.brunojs.exceptions.TableException;
import br.com.brunojs.exceptions.TipoChaveNaoEncontradaException;
import br.com.brunojs.services.generic.GenericService;


@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

	@Override
	public Cliente cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Cliente entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente alterar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente consultar(Long valor) throws MaisDeUmRegistroException, TableException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Cliente> buscarTodos() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}



}
