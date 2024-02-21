package br.com.brunojs.service;

import java.util.List;

import br.com.brunojs.domain.Produto;
import br.com.brunojs.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}