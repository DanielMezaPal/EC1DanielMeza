package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.MallaCurricular;
import com.idat.ecdanielmeza.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {

	
	@Autowired
	private MallaCurricularRepository repository;
	
	@Override
	public void guardarMallaCurricular(MallaCurricular mallacurricular) {
		repository.guardarMallaCurricular(mallacurricular);

	}

	@Override
	public void actualizarMallaCurricular(MallaCurricular mallacurricular) {
		repository.actualizarMallaCurricular(mallacurricular);

	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		repository.eliminarMallaCurricular(id);

	}

	@Override
	public List<MallaCurricular> listarMallas() {
		
		return repository.listarMallas();
	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		
		return repository.obtenerMallaCurricularId(id);
	}

}
