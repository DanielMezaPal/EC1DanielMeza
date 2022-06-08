package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Profesor;
import com.idat.ecdanielmeza.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository repository;
	
	@Override
	public void guardarProfesor(Profesor profesor) {
		repository.guardarProfesor(profesor);

	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		repository.actualizarProfesor(profesor);

	}

	@Override
	public void eliminarProfesor(Integer id) {
		repository.eliminarProfesor(id);

	}

	@Override
	public List<Profesor> listarProfesores() {
		
		return repository.listarProfesores();
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		
		return repository.obtenerProfesorId(id);
	}

}
