package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Controllers are classes that contain methods to handle server requests
//
// When a server receives a request it scans all the classes in the same Java package as the server
// for controllers that will handle the path in the request
//
// REST is a protocol for communication between an application and a server
//
// a protocol is a set of rules for communication


@RestController // Tells the server there are methods in this class to handle REST requests
public class CatController
{
    // Hold the data used by this class (has nothing to do with servers)
    private CatRepository catRepo = new CatRepository();

    // @GetMapping tells the server the method that follows will handle HTTP GET requests
    //      for the URL path specified and identifies type of data returned (usually JSON)
    // In this example: the method will handle HTTP GET requests for the URL path "/cats"
    // The combination of HTTP request and path must be unique
    //      method names must still be unique within a class
    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs() // The name of this method doesn't matter. It's not used anywhere else.
    {
        System.out.println("Method in CatController class was called");
        return new ResponseEntity<>(catRepo.getCats(), HttpStatus.OK);
    }
}
