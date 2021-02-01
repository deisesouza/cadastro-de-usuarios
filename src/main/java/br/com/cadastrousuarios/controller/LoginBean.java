package br.com.cadastrousuarios.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginBean")
@ApplicationScoped
public class LoginBean {

	private String usuario;
	private String senha;
	private String mensagem;

	public String verificaLogin() {
		if (usuario.equalsIgnoreCase("deise") && (senha.equals("12345"))) {
			return "pages/home?faces-redirect=true";
		} else {
			mensagem = "Usuário ou Senha Inválidos";
			return "";
		}
	}
	
	public String cadastrar(){
		return "pages/cadastrar?faces-redirect=true";
	}
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
