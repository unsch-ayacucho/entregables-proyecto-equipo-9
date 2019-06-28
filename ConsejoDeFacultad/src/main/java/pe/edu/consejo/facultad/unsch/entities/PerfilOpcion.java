package pe.edu.consejo.facultad.unsch.entities;
// Generated 28-jun-2019 1:16:48 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PerfilOpcion generated by hbm2java
 */
@Entity
@Table(name = "perfil_opcion", catalog = "consejodefacultad")
public class PerfilOpcion implements java.io.Serializable {

	private Integer idperfilopcion;
	private Opcion opcion;
	private Perfil perfil;
	private Byte estado;

	public PerfilOpcion() {
	}

	public PerfilOpcion(Opcion opcion, Perfil perfil) {
		this.opcion = opcion;
		this.perfil = perfil;
	}

	public PerfilOpcion(Opcion opcion, Perfil perfil, Byte estado) {
		this.opcion = opcion;
		this.perfil = perfil;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idperfilopcion", unique = true, nullable = false)
	public Integer getIdperfilopcion() {
		return this.idperfilopcion;
	}

	public void setIdperfilopcion(Integer idperfilopcion) {
		this.idperfilopcion = idperfilopcion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idopcion", nullable = false)
	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idperfil", nullable = false)
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Column(name = "estado")
	public Byte getEstado() {
		return this.estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

}
