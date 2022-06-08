package com.idat.ecdanielmeza.repository;

import java.util.List;

import com.idat.ecdanielmeza.model.MallaCurricular;

public interface MallaCurricularRepository {
	
	void guardarMallaCurricular(MallaCurricular mallacurricular);
	void actualizarMallaCurricular(MallaCurricular mallacurricular);
	void eliminarMallaCurricular(Integer id);
	List<MallaCurricular> listarMallas();
	MallaCurricular obtenerMallaCurricularId(Integer id);

}
