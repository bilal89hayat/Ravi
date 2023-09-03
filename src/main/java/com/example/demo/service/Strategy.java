package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface Strategy {

    public ResponseEntity executeStrategy(String url, String body);
}
