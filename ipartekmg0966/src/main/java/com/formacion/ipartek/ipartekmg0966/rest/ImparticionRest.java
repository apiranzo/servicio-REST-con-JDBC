package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.ImparticionAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.entidades.Imparticion;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/imparticiones")
public class ImparticionRest {

	@GET
	public List<Imparticion> obtenerImparticion(){
		return ImparticionAccesoDatos.obtenerImparticiones();
	}
	
	@GET
	@Path("/{codigo}")
	public Imparticion obtenerImparticionPorCodigo(@PathParam("codigo") Long codigo) {
		return ImparticionAccesoDatos.obtenerImparticionPorCodigo(codigo);
	}
	
	@POST
	public Response insertarImparticion(Imparticion imparticion) {
		ImparticionAccesoDatos.insertarImparticion(imparticion);
		
		return Response.status(Status.CREATED).entity(imparticion).build();
	}
	
	@PUT
	@Path("/{codigo}")
	public Imparticion modificarImparticion(Imparticion imparticion, @PathParam("codigo") Long codigo) {
		return ImparticionAccesoDatos.modificarImparticion(imparticion);
	}
	
	@DELETE
	@Path("/{codigo}")
	public void borrarImparticion(@PathParam("codigo") Long codigo) {
		ImparticionAccesoDatos.borrarImparticion(codigo);
	}
}
