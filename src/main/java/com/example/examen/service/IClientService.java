package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Client;

public interface IClientService {

	List<Client> findAll();
	
	Client saveClient(Client clienSv);
	
	Client updateClient(Client clientUp, int id);
}
