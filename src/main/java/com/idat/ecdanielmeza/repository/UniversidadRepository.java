package com.idat.ecdanielmeza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{
	


}
