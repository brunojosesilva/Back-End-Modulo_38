package br.com.brunojs.dao;

import java.util.List;

import br.com.brunojs.dao.generic.IGenericDAO;
import br.com.brunojs.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
