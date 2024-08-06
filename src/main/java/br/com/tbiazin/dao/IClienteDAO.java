package br.com.tbiazin.dao;

import java.util.List;

import br.com.tbiazin.dao.generic.IGenericDAO;
import br.com.tbiazin.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
