package com.elastic.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Index {

    private int indexId;
    private String indexName;
    private String data;

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
