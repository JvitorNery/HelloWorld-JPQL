package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PacoteDAO dao = new PacoteDAOImpl(em);
		List<Pacote> pacotes = dao.listar();
		
		List<Pacote> pacotes2 = dao.buscarPorPreco(100, 5000);
				
		for(Pacote pacote : pacotes){
			System.out.println(pacote.getDescricao() + "R$ "+pacote.getPreco()+" "+pacote.getQtdDias());
		}
		System.out.println("\n\n\n pacote listado por preço \n\n\n");
		for(Pacote pacote : pacotes2){
			System.out.println(pacote.getDescricao() + "R$ "+pacote.getPreco()+" "+pacote.getQtdDias());
		}
		em.close();
		System.exit(0);
	}

}
