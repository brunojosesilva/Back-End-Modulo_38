package br.com.brunojs.dao;

import java.util.List;

import br.com.brunojs.dao.generic.IGenericDAO;
import br.com.brunojs.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
