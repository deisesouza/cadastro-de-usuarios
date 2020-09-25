package br.com.cadastrousuarios.controller;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.cadastrousuarios.model.Usuario;

@Named
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = -528613798702573689L;

	@Inject
	private Usuario usuario;
	
	public String iniciarTela(){
		usuario = new Usuario();
		return "incluirusuario";
	}
	
	public void salvar(){
		//FacesContext contexto = FacesContext.getCurrentInstance();
		//contexto.addMessage(null, new FacesMessage("Salvo com sucesso!"));
	}

	public void validarEspacoBranco(FacesContext contexto, UIComponent componente, Object valor){
		String valorString = (String) valor;
		if(valorString.trim().equals("")){
			((UIInput) componente).setValid(false);
		}
	}
	
	public String entrar(){
		return "home";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
		
	
}