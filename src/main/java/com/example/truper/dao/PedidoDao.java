package com.example.truper.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.truper.entity.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, String> {
	
	Pedido findByTicket(String ticket);
	
	List<Pedido> findAll();
	
	@SuppressWarnings("unchecked")
	Pedido save (Pedido pedido);
}

