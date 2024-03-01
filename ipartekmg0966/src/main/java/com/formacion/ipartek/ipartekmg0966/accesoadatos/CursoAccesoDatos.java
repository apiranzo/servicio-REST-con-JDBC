package com.formacion.ipartek.ipartekmg0966.accesoadatos;

import static com.formacion.ipartek.ipartekmg0966.accesoadatos.AccesoDatosJpa.enTransaccion;

import java.util.List;

import com.formacion.ipartek.ipartekmg0966.dtos.CursoSimplificadoDTO;
import com.formacion.ipartek.ipartekmg0966.entidades.Curso;



public class CursoAccesoDatos {
	
	public static List<Curso> obtenerCursos(){
		return enTransaccion(em -> em.createQuery("select c from Curso c", Curso.class).getResultList());
	}
	
	public static List<CursoSimplificadoDTO> obtenerCursosSimplificado(){
		return enTransaccion(em -> em.createQuery("select c.codigo, c.identificador, c.nHoras, c.nombre, c.precio, p.codigo, p.nombre from Curso c join c.profesor p", CursoSimplificadoDTO.class).getResultList());
		
		//OPCIÓN 2
//		return enTransaccion(em -> {
//			var resultado = em.createQuery("select c from Curso c join fetch c.profesor", Curso.class).getResultList();
//			
//			var cursos = new ArrayList<CursoSimplificadoDTO>();
//			
//			CursoSimplificadoDTO cs;
//			ProfesorSimplificadoDTO ps;
//			
//			for(Curso c: resultado) {
//				ps = new ProfesorSimplificadoDTO(c.getProfesor().getCodigo(), c.getProfesor().getNombre());
//				cs = new CursoSimplificadoDTO(c.getCodigo(), c.getIdentificador(), c.getnHoras(), c.getNombre(), c.getPrecio(), ps);
//				
//				cursos.add(cs);
//			}
//			
//			return cursos;
//		});
	
	}
	
	public static Curso obtenerCursoPorCodigo(Long codigo) {
		
		Curso curso = enTransaccion(em -> em.find(Curso.class, codigo));
		
		return curso;
	}
	
	public static void insertarCurso (Curso curso) {
		enTransaccion(em -> {
			em.persist(curso);
			return null;
		});
		
	}
	
	public static Curso modificarCurso (Curso curso) {
		enTransaccion(em -> {
			em.merge(curso);
			return null;
		});
		return curso;
	}
	
	public static void borrarCurso(Long codigo) {
		enTransaccion(em -> {
			em.remove(em.find(Curso.class, codigo));
			return null;
		});
		
	}

}
