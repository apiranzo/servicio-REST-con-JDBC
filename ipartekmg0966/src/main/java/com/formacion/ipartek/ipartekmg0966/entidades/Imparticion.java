package com.formacion.ipartek.ipartekmg0966.entidades;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "imparticion")
public class Imparticion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "curso_codigo", nullable = false, foreignKey = @ForeignKey(name = "fk_imparticion_curso_codigo"))
	private Curso curso; //nn curso_codigo
	
	@ManyToOne
	@JoinColumn(name = "alumno_codigo", nullable = false, foreignKey = @ForeignKey(name = "fk_imparticion_alumno_codigo"))
	private Alumno alumno;// nn curso_codigo
	
	@Column(name = "fMatriculacion", nullable = true)
	private Date fMatriculacion; //puede null
	
	public Imparticion() {
		
	}
	

	public Imparticion(Long codigo, Curso curso, Alumno alumno, Date fMatriculacion) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.alumno = alumno;
		this.fMatriculacion = fMatriculacion;
	}



	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	public Alumno getAlumno() {
		return alumno;
	}



	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}



	public Date getfMatriculacion() {
		return fMatriculacion;
	}



	public void setfMatriculacion(Date fMatriculacion) {
		this.fMatriculacion = fMatriculacion;
	}



	@Override
	public int hashCode() {
		return Objects.hash(alumno, codigo, curso, fMatriculacion);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imparticion other = (Imparticion) obj;
		return Objects.equals(alumno, other.alumno) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(curso, other.curso) && Objects.equals(fMatriculacion, other.fMatriculacion);
	}



	@Override
	public String toString() {
		return "Imparticion [codigo=" + codigo + ", curso=" + curso + ", alumno=" + alumno + ", fMatriculacion="
				+ fMatriculacion + "]";
	}
	
	

}
