package com.nzcs.s2s.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {

    @GetMapping("/api/hello")
    public ResponseEntity<String> getHello(@RequestHeader String client) {
        return ResponseEntity.ok("Hello " + client);
    }
}
