package com.github.ankurpapneja4.bookkeeper.accountservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping("/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void root(){}

}
