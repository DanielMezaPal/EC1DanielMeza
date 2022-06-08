package com.idat.ecdanielmeza.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.Universidad;

@Repository 
public class UniversidadRepositoryImpl implements UniversidadRepository {
	
	public List <Universidad> listar = new ArrayList<Universidad>();

	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Universidad> listarUniversidades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
