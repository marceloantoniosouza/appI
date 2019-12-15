package com.porto.appi.negocio.service;

import org.springframework.stereotype.Service;

import com.porto.appi.negocio.dto.ClienteDTO;

@Service
public class ClienteService {
	
	public ClienteDTO cliente(){
		return new ClienteDTO(4, "Joao I");
	}

}
