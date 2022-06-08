package com.idat.ecdanielmeza.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.Curso;

@Repository 
public class CursoRepositoryImpl implements CursoRepository {

	public List <Curso> listar = new ArrayList<Curso>();
	
	@Override
	public void guardarCurso(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCurso(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso obtenerCursoId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
