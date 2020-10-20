package com.example.regex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.regex.entity.InputDto;
import com.example.regex.entity.OutputDto;
import com.example.regex.service.RegexService;


@RestController
@RequestMapping("/api/regex")
public class RegexController {

    @Autowired
    private RegexService service;

   
    @PostMapping
    OutputDto validate(@RequestBody InputDto input) {
        return service.validate(input);
    }

   
}
