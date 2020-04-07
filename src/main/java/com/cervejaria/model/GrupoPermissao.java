package com.cervejaria.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.cervejaria.pk.GrupoPermissaoPK;

@Entity
public class GrupoPermissao {

	@EmbeddedId
	private GrupoPermissaoPK idsGrupoPermissao = new GrupoPermissaoPK();

	public GrupoPermissao() {
	}
	
	public GrupoPermissao(Grupo grupo, Permissao permissao) {
		idsGrupoPermissao.setGrupo(grupo);
		idsGrupoPermissao.setPermissao(permissao);
	}
	
	public Permissao getPermissao() {
		return idsGrupoPermissao.getPermissao();
	}
	
	public void setPermissao(Permissao permissao) {
		idsGrupoPermissao.setPermissao(permissao);
	}
	
	public Grupo getGrupo() {
		return idsGrupoPermissao.getGrupo();
	}
	public void setGrupo(Grupo grupo) {
		idsGrupoPermissao.setGrupo(grupo);
	}

	
	

}
