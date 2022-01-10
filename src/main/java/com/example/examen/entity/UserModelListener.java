package com.example.examen.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.example.examen.service.impl.SequenceGeneratorService;

@Component
public class UserModelListener extends AbstractMongoEventListener<Client> {

	@Autowired
	private SequenceGeneratorService sequenceGenerator;
	
	
}
