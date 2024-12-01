package com.daniel.bol.upskill.FileService;

import com.daniel.microservices_demo.QueryEntity;

public class QueryEntityMapper {

    public static QueryMongo mapToNewQueryEntity(QueryEntity oldQueryEntity) {
        if (oldQueryEntity == null) {
            return null;
        }

        QueryMongo newQueryEntity = new QueryMongo();
        // newQueryEntity.setId(oldQueryEntity.getId().toString(0));
        newQueryEntity.setQuery(oldQueryEntity.getQuery());
        newQueryEntity.setResponse(oldQueryEntity.getResponse());
        newQueryEntity.setQueryDate(oldQueryEntity.getQueryDate());

        return newQueryEntity;
    }
}
