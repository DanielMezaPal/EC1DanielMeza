package com.idat.ecdanielmeza.repository;

import java.util.List;

import com.idat.ecdanielmeza.model.Universidad;

public interface UniversidadRepository {
	
	void guardarUniversidad(Universidad universidad);
	void actualizarUniversidad(Universidad universidad);
	void eliminarUniversidad(Integer id);
	List<Universidad> listarUniversidades();
	Universidad obtenerUniversidadId(Integer id);

}
