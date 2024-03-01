package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.entidades.Cliente;

public class ClienteAccesoDatos {

	public static List<Cliente> obtenerClientes(){
		return enTransaccion(em -> em.createQuery("select c from Cliente c", Cliente.class).getResultList());
	}
	
	public static Cliente obtenerClientePorCodigo(Long codigo) {
		
		Cliente cliente = enTransaccion(em -> em.find(Cliente.class, codigo));
		
		return cliente;
	}
	
	public static void insertarCliente(Cliente cliente) {
		enTransaccion(em -> {
			em.persist(cliente);
			return null;
		});
		
	}
	
	public static Cliente modificarCliente(Cliente cliente) {
		enTransaccion(em -> {
			em.merge(cliente);
			return null;
		});
		return cliente;
	}
	
	public static void borrarCliente(Long codigo) {
		enTransaccion(em -> {
			em.remove(em.find(Cliente.class, codigo));
			return null;
		});
		
	}
}
