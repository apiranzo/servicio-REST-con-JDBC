package com.formacion.ipartek.ipartekmg0966.dtos;



public record CursoSimplificadoDTO(Long codigo, String identificador, Integer nHoras, String nombre, Double precio, ProfesorSimplificadoDTO profesor) {
	public CursoSimplificadoDTO(Long codigo, String identificador, Integer nHoras, String nombre, Double precio, Long codigoProfesor, String nombreProfesor) {
		this(codigo, identificador, nHoras, nombre, precio, new ProfesorSimplificadoDTO(codigoProfesor, nombreProfesor));
	}
}
