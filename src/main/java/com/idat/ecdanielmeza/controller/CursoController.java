package com.idat.ecdanielmeza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ecdanielmeza.model.Curso;
import com.idat.ecdanielmeza.service.CursoService;

@Controller
@RequestMapping("/curso/v1") 
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@RequestMapping("/listar") 
	public @ResponseBody ResponseEntity<List<Curso>> listar(){
		
		return new ResponseEntity<List<Curso>>(service.listarCursos(), HttpStatus.OK) ;		
	}
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST) 
	public ResponseEntity<Void> guardar( @RequestBody Curso curso ) {
		service.guardarCurso(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE) 
	public ResponseEntity<Void> eliminar( @PathVariable Integer id  ) {
		
		Curso p = service.obtenerCursoId(id);
		
		if(p !=null) {
			service.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT) 
	public ResponseEntity<Void> actualizar( @RequestBody Curso curso ) {
		
		Curso p = service.obtenerCursoId(curso.getIdCurso());
		
		if(p !=null) {
			service.actualizarCurso(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET) 
	public ResponseEntity<Curso> obtenerId( @PathVariable Integer id ) {
		
		Curso p = service.obtenerCursoId(id);
		
		if(p !=null) {
			
			return new ResponseEntity<Curso>(service.obtenerCursoId(id),HttpStatus.OK);
		}
		
		return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		
	}

}
