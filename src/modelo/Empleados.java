package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Empleados", catalog="EmpresaFijos")
@Inheritance(strategy=InheritanceType.JOINED)

public abstract  class Empleados implements Serializable {
	

	protected Empresas empresa;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cif", nullable=false)
	
	
	
public Empresas getEmpresa() {
		return empresa;
	}

	
		

public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
}
	


protected	String dni;

private String nombre;

private	String teléfono;

protected	float porcentaRetención;

public Empleados() {
	super();

}



@Id
@GeneratedValue 
@Column (name ="dniEmp", unique=true , nullable=true)
public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

@Column(name="nombre", length=50)

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Column(name="Telefono" ,length=10)
public String getTeléfono() {
	return teléfono;
}

public void setTeléfono(String teléfono) {
	this.teléfono = teléfono;
}

@Column(name="PorcentajeRetencion")

public float getPorcentaRetención() {
	return porcentaRetención;
}

public void setPorcentaRetención(float porcentaRetención) {
	this.porcentaRetención = porcentaRetención;
}


public abstract void calculoNomina();
	



}
