package com.cervejaria.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cervejaria.enums.StatusVenda;
import com.cervejaria.pk.VendaPK;


@Entity
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private Instant dataCriacao;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double valorFrete;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double valorDesconto;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double valorTotal;
	
	@Column(nullable = false)
	private StatusVenda statusvenda;
	
	@Column(nullable = false)
	private String observacao;
	
	@Column(nullable = false)
	private Instant dataHoraEntrega;
	
	
	@EmbeddedId
	private VendaPK idsVenda = new VendaPK();
	
	
	@OneToMany(mappedBy = "idsItemVenda.venda",
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY, 
			orphanRemoval = true)
	private List<ItemDaVenda> listaItemVenda = new ArrayList<>();
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Cliente cliente;
	
	public Venda() {
		super();
	}

	public Venda(Instant dataCriacao, double valorFrete, double valorDesconto, double valorTotal,
			StatusVenda statusvenda, String observacao, Instant dataHoraEntrega, Cliente cliente, Usuario usuario) {
		super();
		idsVenda.setCliente(cliente);
		idsVenda.setUsuario(usuario);
		this.dataCriacao = dataCriacao;
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.valorTotal = valorTotal;
		this.statusvenda = statusvenda;
		this.observacao = observacao;
		this.dataHoraEntrega = dataHoraEntrega;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Instant getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public StatusVenda getStatusvenda() {
		return statusvenda;
	}

	public void setStatusvenda(StatusVenda statusvenda) {
		this.statusvenda = statusvenda;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Instant getDataHoraEntrega() {
		return dataHoraEntrega;
	}

	public void setDataHoraEntrega(Instant dataHoraEntrega) {
		this.dataHoraEntrega = dataHoraEntrega;
	} 
	
	
	public List<ItemDaVenda> getListaItemVenda(){
		return listaItemVenda;
	}

}
