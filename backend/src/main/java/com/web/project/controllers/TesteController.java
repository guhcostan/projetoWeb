package com.web.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TesteController {


    @GetMapping(value = "/teste")
    public String pingTest(){
        return "Sucesso";
    }
}
