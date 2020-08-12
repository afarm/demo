package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class ApiControllerTest {

    private static final Logger LOG = LogManager.getLogger(ApiControllerTest.class);

    @GetMapping(value="/api"
            //, produces = {"application/xml;charset=UTF-8","application/json;charset=UTF-8"}
            )
    Rs test(HttpServletRequest httpServletRequest, HttpSession httpSession) {
        httpSession.setAttribute("X", 123);
        LOG.info(httpServletRequest.getRequestURI());
        LOG.info(httpSession.getId());
        return new Rs(123, "Привет");
    }

}
