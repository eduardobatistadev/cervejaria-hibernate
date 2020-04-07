package com.cervejaria.pk;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cervejaria.model.Cerveja;
import com.cervejaria.model.Venda;

public class ItemDaVendaPK {
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_cerveja")
	private Cerveja cerveja;
	
	@ManyToOne
	@JoinColumn(name = "id_venda")
	private Venda venda;

	public Cerveja getCerveja() {
		return cerveja;
	}

	public void setCerveja(Cerveja cerveja) {
		this.cerveja = cerveja;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}
