package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.CursoAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.dtos.CursoSimplificadoDTO;
import com.formacion.ipartek.ipartekmg0966.entidades.Curso;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/cursos")
public class CursoRest {
	
	@GET
	public List<Curso> obtenerCursos(){
		return CursoAccesoDatos.obtenerCursos();
	}
	
	@GET
	@Path("/simplificado")
	public List<CursoSimplificadoDTO> obtenerCursosSimplificado(){
		return CursoAccesoDatos.obtenerCursosSimplificado();
	}
	
	@GET
	@Path("/{codigo}")
	public Curso obtenerCursoPorCodigo(@PathParam("codigo") Long codigo) {
		return CursoAccesoDatos.obtenerCursoPorCodigo(codigo);
	}
	
	@POST
	public Response insertarCurso(Curso curso) {
		CursoAccesoDatos.insertarCurso(curso);
		
		return Response.status(Status.CREATED).entity(curso).build();
	}
	
	@PUT
	@Path("/{codigo}")
	public Curso modificarCurso(Curso curso, @PathParam("codigo") Long codigo) {
		return CursoAccesoDatos.modificarCurso(curso);
	}
	
	@DELETE
	@Path("/{codigo}")
	public void borrarCurso(@PathParam("codigo") Long codigo) {
		CursoAccesoDatos.borrarCurso(codigo);
	}

}
