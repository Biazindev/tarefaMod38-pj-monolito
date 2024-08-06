package br.com.tbiazin.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.tbiazin.dao.IClienteDAO;
import br.com.tbiazin.domain.Cliente;
import br.com.tbiazin.exceptions.DAOException;
import br.com.tbiazin.exceptions.MaisDeUmRegistroException;
import br.com.tbiazin.exceptions.TableException;
import br.com.tbiazin.services.generic.GenericService;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
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

}
