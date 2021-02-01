package br.com.cadastrousuarios.controller;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cadastrousuarios.dao.UsuarioDao;
import br.com.cadastrousuarios.model.Usuario;
import br.com.cadastrousuarios.negocio.MessageUtil;

@Named("UsuarioBean")
@ApplicationScoped
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
			mensagens.exibirMsgSucesso();
		} catch (Exception e) {			
			mensagens.exibirMsgErro();	    
			e.printStackTrace();
		}
	}

	List<Usuario> listaUsuarios;
	
	public List<Usuario> listar(){
		try {			
			listaUsuarios = dao.listarTodos();						
		}catch (Exception e) {
			mensagens.exibirMsgErro();	    
			e.printStackTrace();
		}
		return listaUsuarios;	
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
