package br.com.tbiazin.service;

import java.util.List;

import br.com.tbiazin.domain.Produto;
import br.com.tbiazin.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
