package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.AlumnoAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.dtos.AlumnoSimplificadoDTO;
import com.formacion.ipartek.ipartekmg0966.entidades.Alumno;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/alumnos")
public class AlumnoRest {

	@GET
	public List<Alumno> obtenerAlumno(){
		return AlumnoAccesoDatos.obtenerAlumnos();
	}
	
	@GET
	@Path("/simplificados")
	public List<AlumnoSimplificadoDTO> obtenerAlumnoSimplificadosDTO(){
		return AlumnoAccesoDatos.obtenerAlumnosSimplificados();
	}
	
	@GET
	@Path("/{codigo}")
	public Alumno obtenerAlumnoPorCodigo(@PathParam("codigo") Long codigo) {
		return AlumnoAccesoDatos.obtenerAlumnoPorCodigo(codigo);
	}
	
	@POST
	public Response insertarAlumno(Alumno alumno) {
		AlumnoAccesoDatos.insertarAlumno(alumno);
		
		return Response.status(Status.CREATED).entity(alumno).build();
	}
	
	@PUT
	@Path("/{codigo}")
	public Alumno modificarAlumno (Alumno alumno, @PathParam("codigo") Long codigo) {
		return AlumnoAccesoDatos.modificarAlumno(alumno);
	}
	
	@DELETE
	@Path("/{codigo}")
	public void borrarAlumno(@PathParam("codigo") Long codigo) {
		AlumnoAccesoDatos.borrarAlumno(codigo);
	}
}
