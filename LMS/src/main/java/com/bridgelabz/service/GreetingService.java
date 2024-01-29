package com.bridgelabz.service;

import com.bridgelabz.model.Greeting;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GreetingService {

	Mono<Greeting> save(Greeting greeting);

	Flux<Greeting> findAll();

}
