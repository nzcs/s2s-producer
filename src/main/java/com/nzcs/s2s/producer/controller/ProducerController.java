package com.nzcs.s2s.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {


    @GetMapping("/api/hello")
    public ResponseEntity<String> getHello(@RequestHeader String client) {
        return ResponseEntity.ok("Hello " + client);
    }


    @PutMapping("api/{xConnectedSystem}/payment/v1/shops/{shopReference}/payments/{paymentReference}/status")
    public void updateStatus(@RequestHeader(value = "X-Request-ID") String xRequestID,
                             @PathVariable(value = "xConnectedSystem") String xConnectedSystem,
                             @PathVariable("paymentReference") String paymentReference,
                             @PathVariable("shopReference") String shopReference,
                             @RequestBody Object updateStatusDto) {
        System.out.println(updateStatusDto);
    }
}
