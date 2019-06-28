package pe.edu.consejo.facultad.unsch.entities;
// Generated 28-jun-2019 1:16:48 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Citacion generated by hbm2java
 */
@Entity
@Table(name = "citacion", catalog = "consejodefacultad")
public class Citacion implements java.io.Serializable {

	private String idCitacion;
	private Secretariodeactas secretariodeactas;
	private String destinatario;
	private String fechaCitacion;

	public Citacion() {
	}

	public Citacion(String idCitacion, Secretariodeactas secretariodeactas, String destinatario, String fechaCitacion) {
		this.idCitacion = idCitacion;
		this.secretariodeactas = secretariodeactas;
		this.destinatario = destinatario;
		this.fechaCitacion = fechaCitacion;
	}

	@Id

	@Column(name = "idCitacion", unique = true, nullable = false, length = 30)
	public String getIdCitacion() {
		return this.idCitacion;
	}

	public void setIdCitacion(String idCitacion) {
		this.idCitacion = idCitacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SecretarioDeActas_idSecretarioDeActas", nullable = false)
	public Secretariodeactas getSecretariodeactas() {
		return this.secretariodeactas;
	}

	public void setSecretariodeactas(Secretariodeactas secretariodeactas) {
		this.secretariodeactas = secretariodeactas;
	}

	@Column(name = "Destinatario", nullable = false, length = 50)
	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Column(name = "FechaCitacion", nullable = false, length = 50)
	public String getFechaCitacion() {
		return this.fechaCitacion;
	}

	public void setFechaCitacion(String fechaCitacion) {
		this.fechaCitacion = fechaCitacion;
	}

}
