package com.cervejaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Permissao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "idsGrupoPermissao.permissao")
	private GrupoPermissao grupopermissao;

	public Permissao() {
	}

	public Permissao(String nome) {
		super();
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

	public GrupoPermissao getGrupopermissao() {
		return grupopermissao;
	}

	public void setGrupopermissao(GrupoPermissao grupopermissao) {
		this.grupopermissao = grupopermissao;
	}
	
	
}
