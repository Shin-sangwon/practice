package com.springboot.practice.home.controller.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HomeService {

    public String makeError() {
      log.info("makeError 진입");
      throw new RuntimeException();
    }
}
