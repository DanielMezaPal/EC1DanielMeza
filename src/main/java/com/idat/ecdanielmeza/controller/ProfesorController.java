package com.idat.ecdanielmeza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ecdanielmeza.model.Profesor;
import com.idat.ecdanielmeza.service.ProfesorService;

@Controller
@RequestMapping("/profesor/v1") 
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping("/listar") 
	public @ResponseBody ResponseEntity<List<Profesor>> listar(){
		
		return new ResponseEntity<List<Profesor>>(service.listarProfesores(), HttpStatus.OK) ;		
	}
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST) 
	public ResponseEntity<Void> guardar( @RequestBody Profesor profesor ) {
		service.guardarProfesor(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}

}
