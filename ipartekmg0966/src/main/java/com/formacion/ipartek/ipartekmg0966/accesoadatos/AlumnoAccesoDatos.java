package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.entidades.Alumno;

public class AlumnoAccesoDatos {
	
	public static List<Alumno> obtenerAlumnos(){
		return enTransaccion(em -> em.createQuery("select a from Alumno a", Alumno.class).getResultList());
	}
	
	public static Alumno obtenerAlumnoPorCodigo(Long codigo) {
		
		Alumno alumno = enTransaccion(em -> em.find(Alumno.class, codigo));
		
		return alumno;
	}
	
	public static void insertarAlumno(Alumno alumno) {
		enTransaccion(em -> {
			em.persist(alumno);
			return null;
		});
		
	}
	
	public static Alumno modificarAlumno(Alumno alumno) {
		enTransaccion(em -> {
			em.merge(alumno);
			return null;
		});
		return alumno;
	}
	
	public static void borrarAlumno(Long codigo) {
		enTransaccion(em -> {
			em.remove(em.find(Alumno.class, codigo));
			return null;
		});
		
	}

}
