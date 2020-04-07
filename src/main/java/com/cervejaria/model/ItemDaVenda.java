package com.cervejaria.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cervejaria.pk.ItemDaVendaPK;

@Entity
@Table(name = "itemdavenda")
public class ItemDaVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private double valorUnitario;
	
	@EmbeddedId
	private ItemDaVendaPK idsItemVenda = new ItemDaVendaPK();
	

	public ItemDaVenda() {
		super();
	}

	public ItemDaVenda(int quantidade, double valorUnitario, Cerveja cerveja, Venda venda) {
		
		idsItemVenda.setCerveja(cerveja);
		idsItemVenda.setVenda(venda);
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	
	
	public Venda getVenda() {
		return idsItemVenda.getVenda();
	}
	public void setVenda(Venda venda) {
		idsItemVenda.setVenda(venda);
	}
	
	
	public Cerveja getCerveja() {
		return idsItemVenda.getCerveja();
	}
	public void setCerveja(Cerveja cerveja) {
		idsItemVenda.setCerveja(cerveja);
	}
	
	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


}
