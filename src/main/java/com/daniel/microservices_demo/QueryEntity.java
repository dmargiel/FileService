package com.daniel.microservices_demo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data
public class QueryEntity implements Serializable {

    private Long id;
    private String query;
    private String response;
    private Date queryDate;

    public QueryEntity() {
        // this.queryDate = new Date();
    }

    public QueryEntity(String query, String response) {
        this.queryDate = new Date();
        this.query = query;
        this.response = response;
    }
    
}