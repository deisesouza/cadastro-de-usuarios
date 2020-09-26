package br.com.cadastrousuarios.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cadastrousuarios.dao.UsuarioDao;
import br.com.cadastrousuarios.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = -528613798702573689L;

	@Inject
	private Usuario usuario;
	
	UsuarioDao dao = new UsuarioDao();


	public void salvar(){
		try {
			dao.salvar(usuario);	
			FacesContext contexto = FacesContext.getCurrentInstance();
			contexto.addMessage(null, new FacesMessage("Salvo com sucesso!"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

}