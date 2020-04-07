package com.cervejaria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cerveja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private String sku;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double valor;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double teorAlcoolico;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double comissao;

	@Column(nullable = false)
	private String sabor;
	
	@Column(nullable = false)
	private String origem;

	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private String foto;
	
	@Column(nullable = false)
	private String contentType;
	
	// CHAVE ESTRANGEIRA
	@ManyToOne
	@JoinColumn(name = "id_estilo")
	private Estilo estilo;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "idsItemVenda.cerveja")
	private List<ItemDaVenda> itemLista = new ArrayList<>();

	public Cerveja(String sku, String nome, String descricao, double valor, double teorAlcoolico, double comissao,
			String sabor, String origem, int quantidade, String foto, String contentType) {
		super();
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.teorAlcoolico = teorAlcoolico;
		this.comissao = comissao;
		this.sabor = sabor;
		this.origem = origem;
		this.quantidade = quantidade;
		this.foto = foto;
		this.contentType = contentType;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Cerveja [codigo=" + codigo + ", sku=" + sku + ", nome=" + nome + ", descricao=" + descricao + ", valor="
				+ valor + ", teorAlcoolico=" + teorAlcoolico + ", comissao=" + comissao + ", sabor=" + sabor
				+ ", origem=" + origem + ", quantidade=" + quantidade + ", foto=" + foto + ", contentType="
				+ contentType + ", estilo=" + estilo + "]";
	}
	
	
	
	
	
}
