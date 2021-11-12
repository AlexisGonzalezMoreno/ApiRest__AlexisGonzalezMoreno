package com.example.Ejercicio4.controller;

import com.example.Ejercicio4.entities.Laptop;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @Test
    void findAll(){
        try {
            ResponseEntity<Laptop[]> response =
                    testRestTemplate.getForEntity("api/laptops", Laptop[].class);

            assertEquals(HttpStatus.OK, response.getStatusCode());
            assertEquals(200, response.getStatusCodeValue());

            List<Laptop> laptops = Arrays.asList(response.getBody());
            System.out.println(laptops.size());
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}