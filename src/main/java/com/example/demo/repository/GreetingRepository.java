package com.example.demo.repository;

import com.example.demo.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GreetingRepository extends CrudRepository<Greeting, Long>{
}
