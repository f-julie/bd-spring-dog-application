package com.bloomtech.catsanddogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// This code was generated from the Sprint Initializer
//The Spring Initializer generates a starter/skeleton Spring Boot server application
//
// DO NOT CHANGE ANYTHING IN THIS CODE!
//
// Spring Boot is a framework for building server applications
//
// A framework is a set of classes to make common processing easier
//
// Spring Boot uses a Tomcat server by default
//
// Tomcat is a free open source server from Apache
//
// Popular server for Java apps because (1) free, (2) easy to use, (3) stable (doesn't break)
//
// The Tomcat server used by Spring Boot Listens to port 8080
//      a port is simply an address that a process will monitor for data (Listens for data)
//
// A port is like an apartment number is an apartment building
// Suppose you live in apartment whose address is: 123 Main Street, Apt 326
//
// In server terms: 123 Main Street is the server, Apt 326 is the port
//
// To send requests to your Tomcat server, use localhost:8080
//
// localhost means a process on your computer
// :8080 is the port the server is listening to

@SpringBootApplication // Tells Java this is a Spring Boot application
public class Application
{
    //A Spring Boot application starts with a main() method just like any other Java app
    public static void main(String[] args) {

    // Start a server for a Spring Boot application
    //  using the class of the application with any args passed to start the app
        SpringApplication.run(Application.class, args);
    }
}
