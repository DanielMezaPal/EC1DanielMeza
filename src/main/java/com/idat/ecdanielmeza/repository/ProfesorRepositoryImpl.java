package com.idat.ecdanielmeza.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.Profesor;


@Repository
public class ProfesorRepositoryImpl implements ProfesorRepository {
	
	public List <Profesor> listar = new ArrayList<Profesor>();

	@Override
	public void guardarProfesor(Profesor profesor) {
		listar.add(profesor);

	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		
		Profesor p = obtenerProfesorId(profesor.getIdProfesor());
		listar.remove(p);
		listar.add(profesor);
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
		Profesor p = obtenerProfesorId(id);
		listar.remove(p);

	}

	@Override
	public List<Profesor> listarProfesores() {
		
		return listar;
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		
//		if(listar != null) {
//			for (Profesor profesor : listar) {
//				if(profesor.getIdProfesor() == id)
//					return profesor ;
//			}
//		}
//		
//		return null;
		
		return listar.stream().filter(p -> p.getIdProfesor()== id).findFirst().orElse(null);
		
		
	}

}
