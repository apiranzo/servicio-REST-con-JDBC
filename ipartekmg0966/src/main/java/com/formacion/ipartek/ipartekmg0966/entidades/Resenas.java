package com.formacion.ipartek.ipartekmg0966.entidades;

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
@Table(name = "resenas")
public class Resenas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "comentario", nullable = false, length = 200)
	private String comentario; // nn 200
	
	@ManyToOne
	@JoinColumn(name = "alumno_codigo", nullable = false, foreignKey = @ForeignKey(name = "fk_resenas_alumno1"))
	private Alumno alumno; //nn
	
	@ManyToOne
	@JoinColumn(name = "curso_codigo", nullable = false, foreignKey = @ForeignKey(name = "fk_resenas_curso1"))
	private Curso curso;//nn
	
	@ManyToOne
	@JoinColumn(name = "profesor_codigo", nullable = false, foreignKey = @ForeignKey(name = "fk_resenas_profesor1"))
	private Profesor profesor; //nn
	
	public Resenas() {
		
	}
	

	public Resenas(Long id, String comentario, Alumno alumno, Curso curso, Profesor profesor) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.alumno = alumno;
		this.curso = curso;
		this.profesor = profesor;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getComentario() {
		return comentario;
	}



	public void setComentario(String comentario) {
		this.comentario = comentario;
	}



	public Alumno getAlumno() {
		return alumno;
	}



	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	public Profesor getProfesor() {
		return profesor;
	}



	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}



	@Override
	public int hashCode() {
		return Objects.hash(alumno, comentario, curso, id, profesor);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resenas other = (Resenas) obj;
		return Objects.equals(alumno, other.alumno) && Objects.equals(comentario, other.comentario)
				&& Objects.equals(curso, other.curso) && Objects.equals(id, other.id)
				&& Objects.equals(profesor, other.profesor);
	}



	@Override
	public String toString() {
		return "Resenas [id=" + id + ", comentario=" + comentario + ", alumno=" + alumno + ", curso=" + curso
				+ ", profesor=" + profesor + "]";
	}
	
	

}
