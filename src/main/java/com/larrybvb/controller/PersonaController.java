package com.larrybvb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.larrybvb.model.Errors;
import com.larrybvb.model.Persona;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("persona")
@Api(value = "api Persona", description = "informacion de personas",tags = {"api persona"})
public class PersonaController {

	@ApiOperation(value = "listar todas las personas",notes = "lista trae atributos de la persona",tags = {"api persona"})
	@ApiResponses({
		@ApiResponse(code = 200, message = "ok", response = Persona[].class),
		@ApiResponse(code = 401, message = "error", response = Errors.class),
	})
	@GetMapping()
	public ResponseEntity<List<Persona>> listarPersona(){
		List<Persona> list = new ArrayList<>();
		
		list.add(new Persona("julio",19));
		list.add(new Persona("javier",29));
		list.add(new Persona("jose",44));
		list.add(new Persona("juan",23));
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	
	
}
