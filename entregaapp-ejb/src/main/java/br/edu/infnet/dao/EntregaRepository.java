package br.edu.infnet.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.infnet.modelo.Entrega;

@Stateless
public class EntregaRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Entrega salvar(Entrega entrega) {
		return em.merge(entrega);
	}
	
	public List<Entrega> lista(){
		return em.createQuery("from Entrega", Entrega.class).getResultList();
	}
	
	
}
