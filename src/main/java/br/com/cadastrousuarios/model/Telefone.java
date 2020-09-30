package br.com.cadastrousuarios.model;

import javax.persistence.Column;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

@Embeddable
public class Telefone {

	private Integer ddd;

	private String telefone;

	@Column
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@Transient
	public String codigo;
	@Transient
	private String telefoneCompleto;
	
	public void init() {
		separarTelefoneDdd();
	}
	
	public Telefone() {
		
	}

	public void separarTelefoneDdd() {
		this.codigo = this.telefoneCompleto.substring(1, 3);
		this.telefone = this.telefoneCompleto.substring(4, 14);
		this.ddd = Integer.parseInt(codigo);
	}
		
	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTelefoneCompleto() {
		return telefoneCompleto;
	}

	public void setTelefoneCompleto(String telefoneCompleto) {
		this.telefoneCompleto = telefoneCompleto;
	}

}
