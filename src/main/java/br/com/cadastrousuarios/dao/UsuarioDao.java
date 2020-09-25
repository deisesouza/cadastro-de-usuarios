package br.com.cadastrousuarios.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import br.com.cadastrousuarios.model.Usuario;

public class UsuarioDao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	EntityManager gerenciador = new ConectionFactory().Conectar();
	Usuario usuario = new Usuario();

	// INSERT ou UPDATE
	public void salvar(Usuario usuario) {

		try {
			gerenciador.getTransaction().begin();

			if (usuario.getId() == null) {
				gerenciador.persist(usuario);
			} else {
				gerenciador.merge(usuario);
			}

			gerenciador.getTransaction().commit();
		} catch (Exception ex) {
			gerenciador.getTransaction().rollback();
		} finally {
			gerenciador.close();
		}
	}

	// DELETE
	public Usuario remover(Integer id) {

		//Usuario usuario = null;
		try {
			usuario = buscarPorId(usuario.getId());
			gerenciador.getTransaction().begin();
			gerenciador.remove(usuario);
			gerenciador.getTransaction().commit();
		} catch (Exception ex) {
			gerenciador.getTransaction().rollback();
		} finally {
			gerenciador.close();
		}
		return usuario;
	}

	// SELECT(POR ID)
	public Usuario buscarPorId(Integer id) {

		//Usuario usuario = null; 

		try {
			usuario = gerenciador.find(Usuario.class, id);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			gerenciador.close();
		}
		return usuario;
	}

	// SELECT ALL
	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodos() {

		List<Usuario> lista = null;

		try {
			lista = (List<Usuario>) gerenciador.createQuery("from Produto c").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			gerenciador.close();
		}
		return lista;

	}
}
