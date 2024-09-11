package com.thitiwas.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class HomeController {

    @GetMapping("/example")
    public ResponseEntity<String> test(@RequestParam("data") String data) {
        log.debug("test::data:: {}", data);
        return ResponseEntity.ok("Your input " + data);
    }
}
