package com.example.truper.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 8969156063258808972L;

	@Id
	private String ticket;
	
	@Column
	private String nombreCliente;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCompra;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "pedido")
	private List<DetallePedido> detallePedidoList;

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<DetallePedido> getDetallePedidoList() {
		return detallePedidoList;
	}

	public void setDetallePedidoList(List<DetallePedido> detallePedidoList) {
		this.detallePedidoList = detallePedidoList;
	}

}
