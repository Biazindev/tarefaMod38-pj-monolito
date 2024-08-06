package br.com.tbiazin.dao;

import br.com.tbiazin.dao.generic.GenericDAO;
import br.com.tbiazin.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
