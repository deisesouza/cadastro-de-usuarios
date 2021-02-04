package br.com.cadastrousuarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_telefone") 
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;	
	@Column
	private Integer ddd = 0;
	@Column
	private String telefone = "";
	@Column
	private String tipo = "";
	
	private String dddEntrada = "";
	
	@ManyToOne
	private Usuario usuario;
	
	
	public void init() {
		
	}

	public Telefone() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}*/

	public String getDddEntrada() {
		return dddEntrada;
	}

	public void setDddEntrada(String dddEntrada) {
		this.dddEntrada = dddEntrada;
		this.ddd = Integer.parseInt(dddEntrada);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Telefone other = (Telefone) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
