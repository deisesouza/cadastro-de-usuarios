package br.com.cadastrousuarios.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {

		EntityManagerFactory fabricante = Persistence.createEntityManagerFactory("cadastrousuarios");	
		
		public EntityManager Conectar(){
			return fabricante.createEntityManager();
		}
		
	}

