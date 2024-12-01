package com.daniel.bol.upskill.FileService;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.daniel.microservices_demo.QueryEntity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DumpReader {

    //create method to read file

    public List<QueryMongo> readQueries() {
        try (FileInputStream fileInputStream = new FileInputStream("dump.dat");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                    List<QueryEntity> queries = (List<QueryEntity>) objectInputStream.readObject();
                    log.info("Read queries:");
                    queries.forEach(log::info);
            return queries.stream().map(QueryEntityMapper::mapToNewQueryEntity).toList();
        } catch (Exception e) {
            log.error(e.getLocalizedMessage(), e);
            return null;
        }
    }


}
