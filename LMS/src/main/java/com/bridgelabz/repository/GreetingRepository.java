package com.bridgelabz.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Greeting;

import reactor.core.publisher.Flux;

@Repository
public interface GreetingRepository extends R2dbcRepository<Greeting, Integer> {

	
}