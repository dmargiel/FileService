package com.daniel.bol.upskill.FileService;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueryRepository extends MongoRepository<QueryMongo, String>{

}
