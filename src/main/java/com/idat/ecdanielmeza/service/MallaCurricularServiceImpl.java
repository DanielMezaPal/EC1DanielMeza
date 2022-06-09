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
		repository.save(mallacurricular);

	}

	@Override
	public void actualizarMallaCurricular(MallaCurricular mallacurricular) {
		repository.saveAndFlush(mallacurricular);

	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<MallaCurricular> listarMallas() {
		
		return repository.findAll();
	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		
		return repository.findById(id).orElse(null);
	}

}
