package br.com.sematec.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sematec.livraria.dao.UsuarioDAO;
import br.com.sematec.livraria.modelo.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {
	private Usuario usuario = new Usuario();

	public String efetuaLogin() {
		System.out.println("Fazendo login do usuário " + this.usuario.getEmail());
		boolean existe = UsuarioDAO.getInstance().existe(this.usuario);
		if (existe) {
			return "livro?faces-redirect=true";
		}
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
