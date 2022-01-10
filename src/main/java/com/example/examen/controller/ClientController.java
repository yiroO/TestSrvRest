package com.example.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Client;
import com.example.examen.service.IClientService;
import com.example.examen.service.impl.SequenceGeneratorService;

@RestController
@RequestMapping(value = "NutriNet/Cliente")
@Controller
public class ClientController {

	@Autowired
	private IClientService clientService;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@GetMapping()
	public ResponseEntity<List<Client>> getAll(){
		List<Client> client = clientService.findAll();
		if(client != null) {
			return ResponseEntity.ok(client);
		}
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping()
	public ResponseEntity<Client> newClient(@RequestBody Client client) {
		this.validFields(client);
		try {
			clientService.saveClient(client);
			return new ResponseEntity<>(client, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client client) {
	
			clientService.updateClient(client, id);
			return ResponseEntity.ok().build();
	}
	
	public void validFields(Client client) {
		if(client.getName().isEmpty() || client.getName().length() == 0) {
			throw new RuntimeException("El nombe no debe ser nulo");
		}
		
		if(client.getLastname().isEmpty() || client.getLastname().length() == 0) {
			throw new RuntimeException("El apellido no debe ser nulo");
		}

		if(client.getNameUser().isEmpty() || client.getNameUser().length() == 0) {
			throw new RuntimeException("El nombre de usuario no debe ser nulo");
		}

		if(client.getEmail().isEmpty() || client.getEmail().length() == 0) {
			throw new RuntimeException("El email no debe ser nulo");
		}

		if(client.getPassword().isEmpty() || client.getPassword().length() == 0) {
			throw new RuntimeException("La contraseña no debe ser nulo");
		}
	}
	
}
