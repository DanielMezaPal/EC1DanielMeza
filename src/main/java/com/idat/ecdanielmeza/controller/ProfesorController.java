package com.idat.ecdanielmeza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ecdanielmeza.model.Profesor;
import com.idat.ecdanielmeza.service.ProfesorService;

@Controller
@RequestMapping("/profesor/v1") 
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping("/listar") 
	public @ResponseBody List<Profesor> listar(){
		return service.listarProfesores();		
	}

}
