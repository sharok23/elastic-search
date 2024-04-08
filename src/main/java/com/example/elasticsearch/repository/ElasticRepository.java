package com.example.elasticsearch.repository;

import com.example.elasticsearch.model.ElasticSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<ElasticSearch, Long> {
}