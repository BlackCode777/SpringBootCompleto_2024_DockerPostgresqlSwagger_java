package com.blackcode.mongoteste.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blackcode.mongoteste.persistence.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {

}
