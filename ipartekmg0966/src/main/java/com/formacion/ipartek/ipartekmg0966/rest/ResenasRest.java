package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.ResenaAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.entidades.Resenas;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/resenas")
public class ResenasRest {
	
	@GET
	public List<Resenas> obtenerResenas(){
		return ResenaAccesoDatos.obtenerResenas();
	}
	
	@POST
	public Response insertarResena(Resenas resena) {
		ResenaAccesoDatos.insertarResena(resena);
		
		return Response.status(Status.CREATED).entity(resena).build();
	}
	
	@PUT
	@Path("/{id}")
	public Resenas modificarResena(Resenas resena, @PathParam("id") Long id) {
		return ResenaAccesoDatos.modificarResena(resena);
	}
	
	@DELETE
	@Path("/{id}")
	public void borrarResena(@PathParam("id") Long id) {
		ResenaAccesoDatos.borrarResena(id);
	}

}
