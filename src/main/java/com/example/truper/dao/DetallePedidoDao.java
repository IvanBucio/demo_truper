package com.example.truper.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.truper.entity.DetallePedido;

public interface DetallePedidoDao extends CrudRepository<DetallePedido, String> {

	@SuppressWarnings("unchecked")
	DetallePedido save(DetallePedido detalle);
}
