package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Universidad;
import com.idat.ecdanielmeza.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	@Autowired
	private UniversidadRepository repository;
	
	@Override
	public void guardarUniversidad(Universidad universidad) {
		repository.guardarUniversidad(universidad);

	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		repository.actualizarUniversidad(universidad);

	}

	@Override
	public void eliminarUniversidad(Integer id) {
		repository.eliminarUniversidad(id);

	}

	@Override
	public List<Universidad> listarUniversidades() {
		
		return repository.listarUniversidades();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		
		return repository.obtenerUniversidadId(id);
	}

}
