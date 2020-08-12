package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpMethod.*;

class DemoApplicationTests {
    @Test
    void contextLoads() throws URISyntaxException {
        ResponseEntity<String> exchange = new RestTemplate().exchange(new URI("http://localhost:8080/tt?name=123"), GET,
                null, String.class);
        System.out.println(exchange.getBody());
    }
    @Test
    void contextLoadsTest() throws URISyntaxException {
        ResponseEntity<Rs> exchange = new RestTemplate().exchange(new URI("http://localhost:8080/test"), GET,
                null, Rs.class);
        System.out.println(exchange.getBody());
    }
}
