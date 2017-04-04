package br.com.fiap.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.fiap.entity.Pacote;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);
	void alterar(T entity);
	void remover(K codigo) throws IdNotFoundException;
	T pesquisar(K codigo);
	void salvar() throws DBException;
	public List<T> listar2(T entity);
	
}
