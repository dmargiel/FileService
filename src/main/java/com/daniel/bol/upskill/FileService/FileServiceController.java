package com.daniel.bol.upskill.FileService;

import org.springframework.web.bind.annotation.RestController;

import com.daniel.microservices_demo.QueryEntity;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class FileServiceController {

    private final QueryRepository queryRepository;

    public FileServiceController(QueryRepository queryRepository) {
        this.queryRepository = queryRepository;
    }

    @GetMapping("/saveDump")
    public String saveDump() {
        DumpReader dumpReader = new DumpReader();
        // dumpReader.readQueries();
        // return "success";
        List<QueryMongo> savedEntities = queryRepository.insert(dumpReader.readQueries());
        return "saved " + savedEntities.size() + " entities ";
    }

    @GetMapping("/readAllMongo")
    public String readAllMongo() {
        return queryRepository.findAll().stream().map(QueryMongo::toString).collect(Collectors.joining(", "));
    }
    
    

}
