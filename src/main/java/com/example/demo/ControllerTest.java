package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ControllerTest {

    private static final Logger LOG = LogManager.getLogger(ControllerTest.class);

    @GetMapping(value = {"/page", "/"})
    ModelAndView test(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name,
                      HttpServletRequest httpServletRequest, HttpSession httpSession) {
        ModelAndView mv = new ModelAndView("index");
        model.addAttribute("name", name);
        LOG.info(httpServletRequest.getRequestURI());
        LOG.info(httpSession.getId());
        return mv;
    }

    @GetMapping(value = {"/tt"})
    String tt(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "test";
    }
}
