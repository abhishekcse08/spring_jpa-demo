package com.jpa.trainings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/securityDemo")
    public String getNessage(){

        return ("<h3> " +
                "<p> Test Data </p>" +
                "Hello Security Data from training </H3>" +
                "" +
                "" +
                "");
    }
}
