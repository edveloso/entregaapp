package br.edu.infnet.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.infnet.dao.EntregaRepository;
import br.edu.infnet.modelo.Entrega;


@WebService(
		name = "entregaWs",
		serviceName = "EntregaServiceWs",
		targetNamespace = "http://org.jboss.ws/entregaapp/entrega"
		)
@TransactionManagement(TransactionManagementType.CONTAINER)
@Stateless
public class EntregaService {

	@Inject
	private EntregaRepository repository;
	
	@WebMethod
	public List<Entrega> listar(){
		return repository.lista();
	}
	
	@WebMethod
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Entrega salvar(Entrega entrega) {
		return repository.salvar(entrega);
	}
	
	
}
