package com.example.truper.service;

import java.util.List;

import com.example.truper.entity.Pedido;

public interface PedidoService {

	public Pedido getPedidoPorTicket(String ticket);
	
	public String newPedido(Pedido pedido);
	
	public List<Pedido> getTodosPedidos();
}
