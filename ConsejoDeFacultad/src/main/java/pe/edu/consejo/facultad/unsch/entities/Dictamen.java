package pe.edu.consejo.facultad.unsch.entities;
// Generated 07-jun-2019 8:17:32 by Hibernate Tools 5.4.2.Final

/**
 * Dictamen generated by hbm2java
 */
public class Dictamen implements java.io.Serializable {

	private int idDictamen;
	private String nombreDocumento;
	private String estadoDictamen;

	public Dictamen() {
	}

	public Dictamen(int idDictamen, String nombreDocumento, String estadoDictamen) {
		this.idDictamen = idDictamen;
		this.nombreDocumento = nombreDocumento;
		this.estadoDictamen = estadoDictamen;
	}

	public int getIdDictamen() {
		return this.idDictamen;
	}

	public void setIdDictamen(int idDictamen) {
		this.idDictamen = idDictamen;
	}

	public String getNombreDocumento() {
		return this.nombreDocumento;
	}

	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

	public String getEstadoDictamen() {
		return this.estadoDictamen;
	}

	public void setEstadoDictamen(String estadoDictamen) {
		this.estadoDictamen = estadoDictamen;
	}

}