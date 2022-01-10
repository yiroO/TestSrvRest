package com.example.examen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Client;
import com.example.examen.repository.IClientRepository;
import com.example.examen.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientRepository clienRespo;

	@Override
	public List<Client> findAll() {
		return clienRespo.findAll();
	}

	@Override
	public Client saveClient(Client clienSv) {
		Client client = new Client();
		client.setName(clienSv.getName());
		client.setLastname(clienSv.getLastname());
		client.setNameUser(clienSv.getNameUser());
		client.setEmail(clienSv.getEmail());
		client.setPassword(clienSv.getPassword());
		client.setDate_creation(new Date());
		return clienRespo.save(client);
	}

	@Override
	public Client updateClient(Client clientUp, int id) {
		Client client = clienRespo.findById(id).get();
		if (client != null) {
			client.setAge(clientUp.getAge());
			client.setHeight(clientUp.getHeight());
			client.setBodyWeight(clientUp.getBodyWeight());
			client.setGEB(clientUp.getGEB());
			client.setDate_Update(new Date());
			return client = clienRespo.save(client);
		}
		return null;
	}

}
