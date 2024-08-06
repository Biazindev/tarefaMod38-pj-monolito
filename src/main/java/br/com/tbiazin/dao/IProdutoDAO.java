package br.com.tbiazin.dao;

import java.util.List;

import br.com.tbiazin.dao.generic.IGenericDAO;
import br.com.tbiazin.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
