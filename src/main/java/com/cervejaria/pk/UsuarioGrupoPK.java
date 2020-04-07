package com.cervejaria.pk;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cervejaria.model.Grupo;
import com.cervejaria.model.Usuario;

public class UsuarioGrupoPK {
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_grupo")
	private Grupo grupo;
	
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	

}
