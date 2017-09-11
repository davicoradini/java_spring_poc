package com.example.demo.repository;

import com.example.demo.model.Article;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "article", path = "article")
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
}
