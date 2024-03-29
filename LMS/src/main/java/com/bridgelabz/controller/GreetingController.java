package com.bridgelabz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.service.GreetingService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class GreetingController {
	
	@Autowired
	GreetingService greetingService;
	
	@PostMapping("/greeting")
	public Mono<Greeting> saveGreeting(@RequestBody Greeting greeting){
		return greetingService.save(greeting);
	}

	@GetMapping("/getallgreetings")
	public Flux<Greeting> getAllGreetings() {
	    return greetingService.findAll();
	}
}
