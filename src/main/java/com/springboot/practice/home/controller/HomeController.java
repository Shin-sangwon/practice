package com.springboot.practice.home.controller;

import com.springboot.practice.home.controller.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class HomeController {

    private final HomeService homeService;
    @GetMapping("/hello")
    public String hello() {
        log.info("hello 진입");
        homeService.makeError();

        return "Hello world";

    }
}
