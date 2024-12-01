package com.daniel.bol.upskill.FileService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClients;

@SpringBootApplication
public class FileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileServiceApplication.class, args);

		MongoOperations mongoOperations = new MongoTemplate(MongoClients.create(), "bolUpskill");
		mongoOperations.insert(new QueryMongo("queryFromFileService", "responseFromFileService"));

		System.out.println("ilość rekordow w bazie: "+mongoOperations.query(QueryMongo.class).count());

	}

}
