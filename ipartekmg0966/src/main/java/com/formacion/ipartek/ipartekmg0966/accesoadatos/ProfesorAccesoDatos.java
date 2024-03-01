package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.entidades.Profesor;

public class ProfesorAccesoDatos {

	public static List<Profesor> obtenerProfesores(){
		return enTransaccion(em -> em.createQuery("select p from Profesor p", Profesor.class).getResultList());
	}
	
	public static Profesor obtenerProfesorPorCodigo(Long codigo) {
		
		Profesor profesor = enTransaccion(em -> em.find(Profesor.class, codigo));
		
		return profesor;
	}
	
	public static void insertarProfesor(Profesor profesor) {
		enTransaccion(em -> {
			em.persist(profesor);
			return null;
		});
		
	}
	
	public static Profesor modificarProfesor(Profesor profesor) {
		enTransaccion(em -> {
			em.merge(profesor);
			return null;
		});
		return profesor;
	}
	
	public static void borrarProfesor(Long codigo) {
		enTransaccion(em -> {
			em.remove(em.find(Profesor.class, codigo));
			return null;
		});
		
	}
}
