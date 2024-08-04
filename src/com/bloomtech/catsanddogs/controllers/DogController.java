package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.DogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController
{
    private DogRepository dogRepos = new DogRepository();

    @GetMapping(value = "/dogs", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs()
    {
        System.out.println("Method in DogController class was called");
        return new ResponseEntity<>(dogRepos.getDogs(), HttpStatus.OK);
    }
}
