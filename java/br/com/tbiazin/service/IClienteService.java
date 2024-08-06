package br.com.tbiazin.service;

import br.com.tbiazin.domain.Cliente;
import br.com.tbiazin.exceptions.DAOException;
import br.com.tbiazin.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
