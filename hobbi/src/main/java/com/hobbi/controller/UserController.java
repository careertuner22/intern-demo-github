package com.hobbi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.hobbi.model.dto.AppClientSignUpDto;


@RestController
@CrossOrigin(allowedHeaders="*")
public class UserController {
    
	
    

 
    @GetMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody AppClientSignUpDto user) {
        System.out.println(user);
       
        return null;
   

    }
    
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("hello");
		return new String("Testing");
	}
	
}


