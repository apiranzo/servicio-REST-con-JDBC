package com.formacion.ipartek.ipartekmg0966.rest;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.accesoadatos.ClienteAccesoDatos;
import com.formacion.ipartek.ipartekmg0966.entidades.Cliente;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/clientes")
public class ClienteRest {

	@GET
	public List<Cliente> obtenerCliente(){
		return ClienteAccesoDatos.obtenerClientes();
	}
	
	@GET
	@Path("/{codigo}")
	public Cliente obtenerClientePorCodigo(@PathParam("codigo") Long codigo) {
		return ClienteAccesoDatos.obtenerClientePorCodigo(codigo);
	}
	
	@POST
	public Response insertarCliente(Cliente cliente) {
		ClienteAccesoDatos.insertarCliente(cliente);
		
		return Response.status(Status.CREATED).entity(cliente).build();
	}
	
	@PUT
	@Path("/{codigo}")
	public Cliente modificarCliente(Cliente cliente, @PathParam("codigo") Long codigo) {
		return ClienteAccesoDatos.modificarCliente(cliente);
	}
	
	@DELETE
	@Path("/{codigo}")
	public void borrarCliente(@PathParam("codigo") Long codigo) {
		ClienteAccesoDatos.borrarCliente(codigo);
	}
}