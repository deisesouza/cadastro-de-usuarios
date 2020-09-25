package br.com.cadastrousuarios.negocio;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtil {

	String erro = "Erro";
	String detalhe = "Erro ao salvar usuario";

	public void exibirMensagem() {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, erro, detalhe);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, facesMessage); // mensagem global
	}

}
