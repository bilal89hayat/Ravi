package com.example.demo.service;

import com.example.demo.dao.AmazonPayload;
import org.springframework.http.ResponseEntity;

public interface DemoService {
    ResponseEntity getRestTemplateObject(AmazonPayload amazonPayload);
}
