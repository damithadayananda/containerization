package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping(value = "/")
    public ResponseEntity<String> helloEndPoint(){
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
