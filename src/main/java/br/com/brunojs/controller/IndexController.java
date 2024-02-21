package br.com.brunojs.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@SuppressWarnings("deprecation")
@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = -784519597996507487L;

	public String redirectCliente() {
		return "/cliente/list.xhtml";
	}
	
	public String redirectProduto() {
		return "/produto/list.xhtml";
	}
	
	public String redirectVenda() {
		return "/venda/list.xhtml";
	}
}