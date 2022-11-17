package com.ideas2it.training.controller;

import com.ideas2it.training.exceptions.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String test() throws  ResourceNotFoundException{
        //try {
            throw new ResourceNotFoundException("throwed");
        //} catch (ResourceNotFoundException e) {
          //  return null;
        //}
    }
//    public ResponseEntity<String> throwEx()throws ResourceNotFoundException {
//        throw new ResourceNotFoundException("throwed");
//    }
}
