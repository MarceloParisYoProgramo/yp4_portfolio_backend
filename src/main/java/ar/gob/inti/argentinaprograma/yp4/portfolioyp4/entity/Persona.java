package ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PERSONA")
public class Persona {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellido;
	private String descripcion;
	
	public Persona(long id, String nombre, String apellido, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.descripcion = descripcion;
	}

	public Persona() {
		this.id=-1;
		this.nombre="NO TIENE";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
