package com.example.examen.repository;

import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Client;

@Repository
public interface IClientRepository extends MongoRepository<Client, 	Integer>{

}
