package com.cervejaria.pk;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cervejaria.model.Grupo;
import com.cervejaria.model.Permissao;

public class GrupoPermissaoPK {
	
	@ManyToOne
	@JoinColumn(name = "id_grupo")
	private Grupo grupo;
	
	@ManyToOne
	@JoinColumn(name = "id_permissao")
	private Permissao permissao;

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
	
	

}
