package com.idat.ecdanielmeza.repository;

import java.util.List;

import com.idat.ecdanielmeza.model.Curso;

public interface CursoRepository {
	
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCursos();
	Curso obtenerCursoId(Integer id);
	

}
