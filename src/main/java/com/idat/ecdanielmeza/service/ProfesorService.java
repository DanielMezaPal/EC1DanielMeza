package com.idat.ecdanielmeza.service;

import java.util.List;

import com.idat.ecdanielmeza.model.Profesor;

public interface ProfesorService {
	
	void guardarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor> listarProfesores();
	Profesor obtenerProfesorId(Integer id);

}
