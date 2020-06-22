package com.elastic.api.service;

import com.elastic.api.client.ElasticClient;
import com.elastic.api.model.Index;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@Slf4j
public class DataRouter {

    ElasticClient elasticClient;

    public String invokeIndexData(String indexName) {
        return elasticClient.getIndexData(indexName);
    }
}
