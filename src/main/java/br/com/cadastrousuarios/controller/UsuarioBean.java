package br.com.cadastrousuarios.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cadastrousuarios.dao.UsuarioDao;
import br.com.cadastrousuarios.model.Usuario;
import br.com.cadastrousuarios.negocio.MessageUtil;

@Named("UsuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = -528613798702573689L;

	@Inject
	private Usuario usuario;

	UsuarioDao dao = new UsuarioDao();
	MessageUtil mensagens = new MessageUtil();

	public void salvar() {
		try {
			dao.salvar(usuario);
			mensagens.exibirMsgSucesso();
		} catch (Exception e) {
			mensagens.exibirMsgErro();	    
			e.printStackTrace();
		}
	}

	public void remover() {
		try {
			dao.remover(usuario.getId());			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}
	
	public void consultar() {
		try {
			dao.listarTodos();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}