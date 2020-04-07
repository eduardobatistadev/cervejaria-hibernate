package com.cervejaria.model;

import javax.persistence.EmbeddedId;

import com.cervejaria.pk.UsuarioGrupoPK;

public class UsuarioGrupo {
	
	@EmbeddedId
	private UsuarioGrupoPK idsUsuarioGrupo = new UsuarioGrupoPK();

	public UsuarioGrupo() {
	}
	
	public UsuarioGrupo(Grupo grupo, Usuario usuario) {
		idsUsuarioGrupo.setGrupo(grupo);
		idsUsuarioGrupo.setUsuario(usuario);
	}
	
	public Usuario getUsuario() {
		return idsUsuarioGrupo.getUsuario();
	}
	
	public void setUsuario(Usuario usuario) {
		idsUsuarioGrupo.setUsuario(usuario);
	}
	
	public Grupo getGrupo() {
		return idsUsuarioGrupo.getGrupo();
	}
	public void setGrupo(Grupo grupo) {
		idsUsuarioGrupo.setGrupo(grupo);
	}
	

}
