package com.bridgelabz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.repository.GreetingRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	@Autowired
	GreetingRepository greetingRepository;

	@Override
	public Mono<Greeting> save(Greeting greeting) { 
		return greetingRepository.save(greeting);
		 
	}

	@Override
	public Flux<Greeting> findAll() {
		// TODO Auto-generated method stub
		return greetingRepository.findAll();
	} 

}