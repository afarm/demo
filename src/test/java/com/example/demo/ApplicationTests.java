package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.springframework.http.HttpMethod.*;

class ApplicationTests {
    @Test
    void jsp() throws URISyntaxException {
        ResponseEntity<String> exchange = new RestTemplate().exchange(new URI("http://localhost:8080/tt?name=123"), GET,
                null, String.class);
        System.out.println(exchange.getBody());
    }

    @Test
    void api() throws URISyntaxException {
        ResponseEntity<String> exchange = new RestTemplate().exchange(new URI("http://localhost:8080/api"), GET,
                null, String.class);
        System.out.println(exchange.getBody());
    }

    @Test
    void apiJson() throws URISyntaxException {
        RequestEntity<?> requestEntity = RequestEntity.get(new URI("http://localhost:8080/api"))
                .header("Accept", "application/json;charset=UTF-8")
                .build();
        ResponseEntity<String> exchange = new RestTemplate().exchange(requestEntity, String.class);
        System.out.println(exchange.getBody());
    }

    @Test
    void xml() throws URISyntaxException {

        RequestEntity<?> requestEntity = RequestEntity.get(new URI("http://localhost:8080/api"))
                //.accept(MediaType.APPLICATION_XML)
                //.header("Accept", "application/xml")
                .header("Accept", "application/xml;charset=UTF-8")
                //.header("Content-Type", "application/xml")
                //.acceptCharset(UTF_8)
                .build();
        ResponseEntity<String> exchange = new RestTemplate().exchange(requestEntity, String.class);
        System.out.println(exchange.getBody());
    }
}
