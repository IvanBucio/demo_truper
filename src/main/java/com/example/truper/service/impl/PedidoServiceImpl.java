package com.example.truper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.truper.dao.DetallePedidoDao;
import com.example.truper.dao.PedidoDao;
import com.example.truper.entity.DetallePedido;
import com.example.truper.entity.Pedido;
import com.example.truper.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired 
	private PedidoDao pedidoDao;
	
	@Autowired
	private DetallePedidoDao detalleDao;

	@Override
	public Pedido getPedidoPorTicket(String ticket) {
		return pedidoDao.findByTicket(ticket);
	}

	@Override
	public String newPedido(Pedido pedido) {
		
		for(DetallePedido detalle : pedido.getDetallePedidoList()) {
			detalle.setPedido(pedido);
		}
		Pedido guardado = pedidoDao.save(pedido);
		return "Hecho";
	}

	@Override
	public List<Pedido> getTodosPedidos() {
		return pedidoDao.findAll();
	}

}
