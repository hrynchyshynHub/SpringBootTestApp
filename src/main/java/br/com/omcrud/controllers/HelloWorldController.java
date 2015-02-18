package br.com.omcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omcrud.persistence.repositories.UserRepository;

@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
