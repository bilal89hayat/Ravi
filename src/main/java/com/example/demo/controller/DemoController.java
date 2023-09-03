package com.example.demo.controller;


import com.example.demo.dao.AmazonPayload;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    DemoService demoService;

    @PostMapping("first")
    public ResponseEntity first(@RequestBody AmazonPayload amazonPayload){

          return demoService.getRestTemplateObject(amazonPayload);

    }
}
