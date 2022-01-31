package com.example.truper.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.truper.entity.Pedido;
import com.example.truper.service.PedidoService;

@RestController
public class PedidoRestController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping("/getAll")
	public List<Pedido> getAllPedidos () {
		return service.getTodosPedidos();
	}
	
	
	@GetMapping("/get/{ticket}")
	public Pedido getPedidoPorTicket(@PathVariable String ticket) {
		
		return service.getPedidoPorTicket(ticket);
	}
	
	@PostMapping
	public String newPedido(@RequestBody Pedido pedido) {
		
		return service.newPedido(pedido);
	}

}
