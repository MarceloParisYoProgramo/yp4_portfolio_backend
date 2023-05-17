package ar.gob.inti.argentinaprograma.yp4.portfolioyp4.to;

import java.util.List;

import ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity.Experiencia;
import ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity.Persona;



public class Portfolio {
	
	private Persona persona;
	private List<Experiencia> experiencias;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public List<Experiencia> getExperiencias() {
		return experiencias;
	}
	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}
	
		

}
