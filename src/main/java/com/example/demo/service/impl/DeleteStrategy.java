package com.example.demo.service.impl;

import com.example.demo.service.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DeleteStrategy implements Strategy {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ResponseEntity executeStrategy(String url, String body) {
        return null;
    }
}
