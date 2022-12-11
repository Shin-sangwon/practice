package com.springboot.practice.home.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalErrorController {

    @ExceptionHandler(RuntimeException.class)
    public String handling() {
        log.warn("handling 호출");
        return "hi error";
    }

}
