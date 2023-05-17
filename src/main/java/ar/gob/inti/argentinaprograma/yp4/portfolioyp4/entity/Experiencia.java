package ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;


@Entity (name = "EXPERIENCIA")
public class Experiencia {
   @Id
   private long id;
   @Basic
   private String tecnologia;
   @Column (name = "FECHA_DESDE")
   private Date fechaDesde;
   @Column (name = "PERSONA_ID")
   private long personaId;

   public Experiencia() {
   }

	public Experiencia(long id, String tecnologia, Date fechaDesde, long personaId) {
		super();
		this.id = id;
		this.tecnologia = tecnologia;
		this.fechaDesde = fechaDesde;
		this.personaId = personaId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public long getPersonaId() {
		return personaId;
	}

	public void setPersonaId(long personaId) {
		this.personaId = personaId;
	}

	@Override
	public String toString() {
		return "Experiencia [id=" + id + ", tecnologia=" + tecnologia + ", fechaDesde=" + fechaDesde + ", personaId="
				+ personaId + "]";
	}
   
   
}
