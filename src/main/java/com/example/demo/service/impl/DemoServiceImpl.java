package com.example.demo.service.impl;


import com.example.demo.dao.AmazonPayload;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    RestTemplate restTemplate;


    @Override
    public ResponseEntity getRestTemplateObject(AmazonPayload amazonPayload) {

        String httpMethod = amazonPayload.getHttpMethod().toUpperCase();
        switch (httpMethod){
            case "POST" :
                //restTemplate.postForEntity();

            case "GET":
                //restTemplate.getForEntity();

            case "DELETE":
                //restTemplate.delete();

            case  "UPDATE":
                //restTemplate.patchForObject();
        }

        return null;
    }
}
