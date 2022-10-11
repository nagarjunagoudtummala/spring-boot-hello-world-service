package com.nagarjuna.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final Logger LOGGER = LogManager.getLogger(HelloWorldController.class);

    // http://localhost:8080/
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> hello() {
        LOGGER.info("Invoked HelloWorldController.java # hello() method");
        String message = "Hello Openshift World";
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
        LOGGER.info("Exited HelloWorldController.java # hello() method");
        return responseEntity;
    }
}
