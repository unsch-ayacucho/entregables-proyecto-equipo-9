package pe.edu.consejo.facultad.unsch.entities;
// Generated 07-jun-2019 8:17:32 by Hibernate Tools 5.4.2.Final

/**
 * Alumno generated by hbm2java
 */
public class Alumno implements java.io.Serializable {

	private String idAlumno;
	private String escuela;
	private String serie;
	private String miembroConsejoFacultadIdMiembroConsejoFacultad;

	public Alumno() {
	}

	public Alumno(String idAlumno, String escuela, String serie,
			String miembroConsejoFacultadIdMiembroConsejoFacultad) {
		this.idAlumno = idAlumno;
		this.escuela = escuela;
		this.serie = serie;
		this.miembroConsejoFacultadIdMiembroConsejoFacultad = miembroConsejoFacultadIdMiembroConsejoFacultad;
	}

	public String getIdAlumno() {
		return this.idAlumno;
	}

	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getEscuela() {
		return this.escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getMiembroConsejoFacultadIdMiembroConsejoFacultad() {
		return this.miembroConsejoFacultadIdMiembroConsejoFacultad;
	}

	public void setMiembroConsejoFacultadIdMiembroConsejoFacultad(
			String miembroConsejoFacultadIdMiembroConsejoFacultad) {
		this.miembroConsejoFacultadIdMiembroConsejoFacultad = miembroConsejoFacultadIdMiembroConsejoFacultad;
	}

}