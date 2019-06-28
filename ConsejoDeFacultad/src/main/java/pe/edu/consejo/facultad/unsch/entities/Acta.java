package pe.edu.consejo.facultad.unsch.entities;
// Generated 28-jun-2019 1:16:48 by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Acta generated by hbm2java
 */
@Entity
@Table(name = "acta", catalog = "consejodefacultad")
public class Acta implements java.io.Serializable {

	private String idActa;
	private Miembroconsejofacultad miembroconsejofacultad;
	private Secretariodeactas secretariodeactas;
	private String nombre;
	private Date horaInicio;
	private Date horaFin;

	public Acta() {
	}

	public Acta(String idActa, Miembroconsejofacultad miembroconsejofacultad, Secretariodeactas secretariodeactas,
			String nombre, Date horaInicio, Date horaFin) {
		this.idActa = idActa;
		this.miembroconsejofacultad = miembroconsejofacultad;
		this.secretariodeactas = secretariodeactas;
		this.nombre = nombre;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id

	@Column(name = "idActa", unique = true, nullable = false, length = 15)
	public String getIdActa() {
		return this.idActa;
	}

	public void setIdActa(String idActa) {
		this.idActa = idActa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MiembroConsejoFacultad_idMiembroConsejoFacultad", nullable = false)
	public Miembroconsejofacultad getMiembroconsejofacultad() {
		return this.miembroconsejofacultad;
	}

	public void setMiembroconsejofacultad(Miembroconsejofacultad miembroconsejofacultad) {
		this.miembroconsejofacultad = miembroconsejofacultad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SecretarioDeActas_idSecretarioDeActas", nullable = false)
	public Secretariodeactas getSecretariodeactas() {
		return this.secretariodeactas;
	}

	public void setSecretariodeactas(Secretariodeactas secretariodeactas) {
		this.secretariodeactas = secretariodeactas;
	}

	@Column(name = "Nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HoraInicio", nullable = false, length = 8)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HoraFin", nullable = false, length = 8)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

}