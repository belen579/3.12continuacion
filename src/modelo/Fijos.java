package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Fijos", catalog="EmpresaFijos")
@PrimaryKeyJoinColumn(name="empleadoid")

public class Fijos extends Empleados implements Serializable{
	
	
private	int salarioBase;

private	int trienios;




public Fijos() {
	super();
	
}
@Column (name="SalarioBase")
public int getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(int salarioBase) {
	this.salarioBase = salarioBase;
}

@Column (name="trienios")

public int getTrienios() {
	return trienios;
}

public void setTrienios(int trienios) {
	this.trienios = trienios;
}

@Override
public void calculoNomina() {

  double sueldo=  (this.salarioBase+this.trienios) - (this.salarioBase+this.trienios)* super.porcentaRetención;
	
}




	

	

}
