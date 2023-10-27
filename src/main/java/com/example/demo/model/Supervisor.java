package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_supervisor")
public class Supervisor {
	@Id
	@Column(name="cod_supervisor")
	private int codigoS;
	
	@Column(name="nom_supervisor")
	private String nombre;
	
	@Column(name="ape_supervisor")
	private String apellido;
	
	@Column(name="dni_supervisor")
	private String dni;
	
	@Column(name="num_hijos")
	private int  numeroH;
	
	@Column(name="sueldo")
	private double  sueldo;
	
	@ManyToOne
	@JoinColumn(name="cod_sucursal")
	private Sucursal sucursal;

	public int getCodigoS() {
		return codigoS;
	}

	public void setCodigoS(int codigoS) {
		this.codigoS = codigoS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeroH() {
		return numeroH;
	}

	public void setNumeroH(int numeroH) {
		this.numeroH = numeroH;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	
	
	
	
	
	
	

}
