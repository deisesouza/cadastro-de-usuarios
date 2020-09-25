package br.com.cadastrousuarios.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbusuarios")
public class Usuario implements Serializable{
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private List <Integer> ddd = new ArrayList<Integer>();
	
	@Column
	private List <String> telefone = new ArrayList<String>();
	
	
	public Usuario() {
		
	}
	
	/*
	public String telefoneCompleto(Integer ddd, String telefones) {
		String telefoneCompleto = ddd + " " + telefones;
		return telefoneCompleto;
	}*/

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Integer> getDdd() {
		return ddd;
	}


	public void setDdd(List<Integer> ddd) {
		this.ddd = ddd;
	}


	public List<String> getTelefone() {
		return telefone;
	}


	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}