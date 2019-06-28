package pe.edu.consejo.facultad.unsch.entities;
// Generated 28-jun-2019 1:16:48 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Miembroconsejofacultad generated by hbm2java
 */
@Entity
@Table(name = "miembroconsejofacultad", catalog = "consejodefacultad")
public class Miembroconsejofacultad implements java.io.Serializable {

	private String idMiembroConsejoFacultad;
	private String nombreMiembro;
	private String apellidoPaternoMiembro;
	private String apellidoMaternoMiembro;
	private String dnimiembro;
	private Set<Decano> decanos = new HashSet<Decano>(0);
	private Set<Docente> docentes = new HashSet<Docente>(0);
	private Set<Alumno> alumnos = new HashSet<Alumno>(0);
	private Set<Dictamen> dictamens = new HashSet<Dictamen>(0);
	private Set<Acta> actas = new HashSet<Acta>(0);

	public Miembroconsejofacultad() {
	}

	public Miembroconsejofacultad(String idMiembroConsejoFacultad, String nombreMiembro, String apellidoPaternoMiembro,
			String apellidoMaternoMiembro, String dnimiembro) {
		this.idMiembroConsejoFacultad = idMiembroConsejoFacultad;
		this.nombreMiembro = nombreMiembro;
		this.apellidoPaternoMiembro = apellidoPaternoMiembro;
		this.apellidoMaternoMiembro = apellidoMaternoMiembro;
		this.dnimiembro = dnimiembro;
	}

	public Miembroconsejofacultad(String idMiembroConsejoFacultad, String nombreMiembro, String apellidoPaternoMiembro,
			String apellidoMaternoMiembro, String dnimiembro, Set<Decano> decanos, Set<Docente> docentes,
			Set<Alumno> alumnos, Set<Dictamen> dictamens, Set<Acta> actas) {
		this.idMiembroConsejoFacultad = idMiembroConsejoFacultad;
		this.nombreMiembro = nombreMiembro;
		this.apellidoPaternoMiembro = apellidoPaternoMiembro;
		this.apellidoMaternoMiembro = apellidoMaternoMiembro;
		this.dnimiembro = dnimiembro;
		this.decanos = decanos;
		this.docentes = docentes;
		this.alumnos = alumnos;
		this.dictamens = dictamens;
		this.actas = actas;
	}

	@Id

	@Column(name = "idMiembroConsejoFacultad", unique = true, nullable = false, length = 30)
	public String getIdMiembroConsejoFacultad() {
		return this.idMiembroConsejoFacultad;
	}

	public void setIdMiembroConsejoFacultad(String idMiembroConsejoFacultad) {
		this.idMiembroConsejoFacultad = idMiembroConsejoFacultad;
	}

	@Column(name = "NombreMiembro", nullable = false, length = 45)
	public String getNombreMiembro() {
		return this.nombreMiembro;
	}

	public void setNombreMiembro(String nombreMiembro) {
		this.nombreMiembro = nombreMiembro;
	}

	@Column(name = "ApellidoPaternoMiembro", nullable = false, length = 45)
	public String getApellidoPaternoMiembro() {
		return this.apellidoPaternoMiembro;
	}

	public void setApellidoPaternoMiembro(String apellidoPaternoMiembro) {
		this.apellidoPaternoMiembro = apellidoPaternoMiembro;
	}

	@Column(name = "ApellidoMaternoMiembro", nullable = false, length = 45)
	public String getApellidoMaternoMiembro() {
		return this.apellidoMaternoMiembro;
	}

	public void setApellidoMaternoMiembro(String apellidoMaternoMiembro) {
		this.apellidoMaternoMiembro = apellidoMaternoMiembro;
	}

	@Column(name = "DNIMiembro", nullable = false, length = 8)
	public String getDnimiembro() {
		return this.dnimiembro;
	}

	public void setDnimiembro(String dnimiembro) {
		this.dnimiembro = dnimiembro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroconsejofacultad")
	public Set<Decano> getDecanos() {
		return this.decanos;
	}

	public void setDecanos(Set<Decano> decanos) {
		this.decanos = decanos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroconsejofacultad")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroconsejofacultad")
	public Set<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroconsejofacultad")
	public Set<Dictamen> getDictamens() {
		return this.dictamens;
	}

	public void setDictamens(Set<Dictamen> dictamens) {
		this.dictamens = dictamens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroconsejofacultad")
	public Set<Acta> getActas() {
		return this.actas;
	}

	public void setActas(Set<Acta> actas) {
		this.actas = actas;
	}

}
