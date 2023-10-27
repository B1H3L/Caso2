package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_sucursal")
public class Sucursal {
@Id
@Column(name="cod_sucursal")
private int codigo;

@Column(name="nom_sucursal")
private String nombreS;

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombreS() {
	return nombreS;
}

public void setNombreS(String nombreS) {
	this.nombreS = nombreS;
}




	
}
