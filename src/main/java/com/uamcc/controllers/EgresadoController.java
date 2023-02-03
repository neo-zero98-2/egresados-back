package com.uamcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uamcc.dtos.Greeting;
import com.uamcc.entitys.EgresadoEntity;
import com.uamcc.services.EgresadoService;
import com.uamcc.utils.WrapperResponse;

@Controller
@RequestMapping(path="/egresados/v1")
public class EgresadoController {
	@Autowired
	private EgresadoService service;
	
	@GetMapping("/greeting")
	public ResponseEntity<WrapperResponse<Greeting>> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		Greeting greeting = new Greeting("Hello Uatx");
		return new WrapperResponse<>(true, "success", greeting).createResponse();
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<EgresadoEntity> getAll() {
	    return service.getAll();
	}
	
}
