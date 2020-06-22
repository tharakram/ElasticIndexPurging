package com.elastic.api.client;


import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthRequest;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthResponse;
import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.elasticsearch.action.admin.indices.get.GetIndexResponse;
import org.elasticsearch.action.support.IndicesOptions;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ElasticClient {

    static String HOST = "localhost";
    static Integer PORT_ONE = 9200;
    static Integer PORT_TWO = 9201;
    static String SCHEME = "http";

    public String getIndexData(String indexName) {
        return null;
    }

    public static void main(String[] args) throws IOException {

        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(
                        new HttpHost("localhost", 9200, "http"),
                        new HttpHost("localhost", 9201, "http")));
        System.out.println("Getting Elastic Data");

        ClusterHealthRequest request = new ClusterHealthRequest();
        //request.indicesOptions(IndicesOptions.);

        ClusterHealthResponse response = client.cluster().health(request, RequestOptions.DEFAULT);
        Set<String> indices = response.getIndices().keySet();


        for (String index: indices) {
            System.out.println(index);
        }

        System.out.println("Got Elastic Data");
    }
}