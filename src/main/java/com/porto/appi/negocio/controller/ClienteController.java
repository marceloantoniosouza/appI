package com.porto.appi.negocio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.porto.appi.negocio.dto.ClienteDTO;
import com.porto.appi.negocio.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("")
	public ClienteDTO cliente() {
		return clienteService.cliente();
	}

}
