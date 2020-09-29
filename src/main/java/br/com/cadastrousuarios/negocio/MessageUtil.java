package br.com.cadastrousuarios.negocio;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtil {

	String erro = "Erro";
	String sucesso = "Sucesso";
	String detalheErroSalvar = "Erro ao salvar usuario";
	String detalheSucessoSalvar = "Sucesso ao salvar usuario";

	
	public void exibirMsgSucesso() {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, sucesso, detalheSucessoSalvar);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, facesMessage); // mensagem global
	}
	
	
	public void exibirMsgErro() {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, erro, detalheErroSalvar);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, facesMessage); // mensagem global
	}

}
