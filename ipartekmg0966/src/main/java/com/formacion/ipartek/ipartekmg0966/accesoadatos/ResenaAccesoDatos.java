package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.entidades.Resenas;



public class ResenaAccesoDatos {

	public static List<Resenas> obtenerResenas(){
		return enTransaccion(em -> em.createQuery("select r from Resenas r", Resenas.class).getResultList());
	}
	
	public static void insertarResena (Resenas resena) {
		enTransaccion(em -> {
			em.persist(resena);
			return null;
		});
		
	}
	
	public static Resenas modificarResena (Resenas resena) {
		enTransaccion(em -> {
			em.merge(resena);
			return null;
		});
		return resena;
	}
	
	public static void borrarResena(Long id) {
		enTransaccion(em -> {
			em.remove(em.find(Resenas.class, id));
			return null;
		});
		
	}
	
	
}
