package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.ProfesorAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.entidades.Profesor;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/profesores")
public class ProfesorRest {

	@GET
	public List<Profesor> obtenerProfesor(){
		return ProfesorAccesoDatos.obtenerProfesores();
	}
	
	@GET
	@Path("/{codigo}")
	public Profesor obtenerProfesorPorCodigo(@PathParam("codigo") Long codigo) {
		return ProfesorAccesoDatos.obtenerProfesorPorCodigo(codigo);
	}
	
	@POST
	public Response insertarProfesor(Profesor profesor) {
		ProfesorAccesoDatos.insertarProfesor(profesor);
		
		return Response.status(Status.CREATED).entity(profesor).build();
	}
	
	@PUT
	@Path("/{codigo}")
	public Profesor modificarProfesor(Profesor profesor, @PathParam("codigo") Long codigo) {
		return ProfesorAccesoDatos.modificarProfesor(profesor);
	}
	
	@DELETE
	@Path("/{codigo}")
	public void borrarProfesor(@PathParam("codigo") Long codigo) {
		ProfesorAccesoDatos.borrarProfesor(codigo);
	}
}
