package com.cervejaria.pk;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cervejaria.model.Cliente;
import com.cervejaria.model.Usuario;

public class VendaPK {
	
	@OneToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
