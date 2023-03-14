package modelo;

import java.io.Serializable;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="temporales", catalog="EmpresaFijos")

@PrimaryKeyJoinColumn(name="empleadoid")
public class Temporales extends Empleados implements Serializable {
	


@Column(name="FechaInicio", length=10)
private	LocalDate fechaInicio;


@Column(name="FechaFin", length=10)

private	LocalDate fechaFin;

private	float pagoDia;

private	float suplemento;

public Temporales(LocalDate fechaInicio, LocalDate fechaFin, float pagoDia, float suplemento) {
	super();
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.pagoDia = pagoDia;
	this.suplemento = suplemento;
}


public LocalDate getFechaInicio() {
	return fechaInicio;
}

public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}



public LocalDate getFechaFin() {
	return fechaFin;
}

public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}

@Column (name="pagoDia")

public float getPagoDia() {
	return pagoDia;
}

public void setPagoDia(float pagoDia) {
	this.pagoDia = pagoDia;
}

@Column (name="suplemento")

public float getSuplemento() {
	return suplemento;
}

public void setSuplemento(float suplemento) {
	this.suplemento = suplemento;
}

@Override
public void calculoNomina() {
	
	 
	
	double sueldo= this.pagoDia*(ChronoUnit.DAYS.between(fechaInicio, fechaFin) ) -this.pagoDia*(ChronoUnit.DAYS.between(fechaInicio, fechaFin))*super.porcentaRetención+this.suplemento;
}




}
