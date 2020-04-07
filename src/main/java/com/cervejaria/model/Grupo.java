package com.cervejaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "idsUsuarioGrupo.grupo")
	private UsuarioGrupo usuariogrupo;

	@OneToMany(mappedBy = "idsGrupoPermissao.grupo")
	private GrupoPermissao grupopermissao;
	
	public Grupo() {
	}

	public Grupo(String nome) {
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UsuarioGrupo getUsuariogrupo() {
		return usuariogrupo;
	}

	public void setUsuariogrupo(UsuarioGrupo usuariogrupo) {
		this.usuariogrupo = usuariogrupo;
	}
	
	

}
