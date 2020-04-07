package com.cervejaria.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cervejaria.enums.StatusUsuario;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private StatusUsuario usuario;
	
	@Column(nullable = false)
	private Instant dt_nascimento;
	
	@OneToOne(mappedBy = "idsVenda.usuario")
	private Venda venda;
	
	@OneToMany(mappedBy = "idsUsuarioGrupo.usuario")
	private UsuarioGrupo usuariogrupo;

	public Usuario(String nome, String email, String senha, StatusUsuario usuario, Instant dt_nascimento) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
		this.dt_nascimento = dt_nascimento;
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

	public StatusUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(StatusUsuario usuario) {
		this.usuario = usuario;
	}

	public Instant getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Instant dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
	
	

}
