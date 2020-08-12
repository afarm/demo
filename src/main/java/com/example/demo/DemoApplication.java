package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
public class DemoApplication {

    private static final Logger LOG = LogManager.getLogger(DemoApplication.class);

    @GetMapping("/test")
    Rs test(HttpServletRequest httpServletRequest, HttpSession httpSession) {

        httpSession.setAttribute("X", 123);

        LOG.info(httpServletRequest.getRequestURI());
        LOG.info(httpSession.getId());
        return new Rs(123, "Привет");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



}
