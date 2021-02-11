package com.prueba;
 
import java.sql.Date;

public class Proveedores  {
	/*
	 * Clase proveedores que contiene los datos de los distintos proveedores
	 * */
	  
	public int idProveedor;
	public String nombre;
	public Date fechaDeAlta;
	public int idCliente;
	
	public Proveedores() {
		super(); 
	}

	
	public Proveedores(int id_proveedor, String nombre, Date fecha_de_alta, int id_cliente) {
		super();
		this.idProveedor = id_proveedor;
		this.nombre = nombre;
		this.fechaDeAlta = fecha_de_alta;
		this.idCliente = id_cliente;
	}


	public int getId_proveedor() {
		return idProveedor;
	}


	public void setId_proveedor(int id_proveedor) {
		this.idProveedor = id_proveedor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFecha_de_alta() {
		return fechaDeAlta;
	}


	public void setFecha_de_alta(Date fecha_de_alta) {
		this.fechaDeAlta = fecha_de_alta;
	}


	public int getId_cliente() {
		return idCliente;
	}


	public void setId_cliente(int id_cliente) {
		this.idCliente = id_cliente;
	}
	
	
	

}
