package com.idat.ecdanielmeza.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.MallaCurricular;

@Repository 
public class MallaCurricularRepositoryImpl implements MallaCurricularRepository {

	public List <MallaCurricular> listar = new ArrayList<MallaCurricular>();

	@Override
	public void guardarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MallaCurricular> listarMallas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
