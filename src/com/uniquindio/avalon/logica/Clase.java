package com.uniquindio.avalon.logica;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Clase {
	
	private String codigo;
	private Date fecha;
	private String descripcion;
	private String observacion;
	private String cedulaCliente;
	private String cedulaEmpleado;
	private double duracion;
	
	
	
	
	public Clase() {
		super();
	}

}
