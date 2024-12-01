package com.daniel.bol.upskill.FileService;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@Data
public class QueryMongo implements Serializable {

    // private static final long serialVersionUID = -6789668443296599879L;

    @Id
    private String id;
    private String query;
    private String response;
    private Date queryDate;

    public QueryMongo() {
    }

    public QueryMongo(String query, String response) {
        this.queryDate = new Date();
        this.query = query;
        this.response = response;
    }
    
}

