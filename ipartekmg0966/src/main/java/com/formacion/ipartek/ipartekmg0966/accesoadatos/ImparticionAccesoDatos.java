package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.entidades.Imparticion;

public class ImparticionAccesoDatos {

	public static List<Imparticion> obtenerImparticiones(){
		return enTransaccion(em -> em.createQuery("select i from Imparticion i", Imparticion.class).getResultList());
	}
	
	public static Imparticion obtenerImparticionPorCodigo(Long codigo) {
		
		Imparticion imparticion = enTransaccion(em -> em.find(Imparticion.class, codigo));
		
		return imparticion;
	}
	
	public static void insertarImparticion(Imparticion imparticion) {
		enTransaccion(em -> {
			em.persist(imparticion);
			return null;
		});
		
	}
	
	public static Imparticion modificarImparticion(Imparticion imparticion) {
		enTransaccion(em -> {
			em.merge(imparticion);
			return null;
		});
		return imparticion;
	}
	
	public static void borrarImparticion(Long codigo) {
		enTransaccion(em -> {
			em.remove(em.find(Imparticion.class, codigo));
			return null;
		});
		
	}
}
