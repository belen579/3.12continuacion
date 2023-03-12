package modelo;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name="Empresa", catalog="EmpresaFijos")
@Inheritance(strategy=InheritanceType.JOINED)


public class Empresas  implements Serializable{
	
	
	
	
 private	String cif;

 private	String nombre;

 private	String dirección;

 private	String teléfono;

private 	Set<Empleados>empleados= new HashSet<>() ;

public Empresas() {
	super();
	
}

@Id

@Column (name ="cif", unique=true , nullable=true)
@PrimaryKeyJoinColumn

public String getCif() {
	return cif;
}

public void setCif(String cif) {
	this.cif = cif;
}

@Column(name="nombre", length=50)

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Column(name="Direccion", length=50)

public String getDirección() {
	return dirección;
}

public void setDirección(String dirección) {
	this.dirección = dirección;
}

@Column(name="Telefono", length=50)

public String getTeléfono() {
	return teléfono;
}

public void setTeléfono(String teléfono) {
	this.teléfono = teléfono;
}


@OneToMany(fetch=FetchType.LAZY, mappedBy="empresa", cascade =CascadeType.REMOVE)

public Set<Empleados> getEmpleados() {
	return empleados;
}

public void setEmpleados(Set<Empleados> empleados) {
	this.empleados = empleados;
}

@Override
public String toString() {
	return "Empresas [cif=" + cif + ", nombre=" + nombre + ", dirección=" + dirección + ", teléfono=" + teléfono + "]";
}








}
