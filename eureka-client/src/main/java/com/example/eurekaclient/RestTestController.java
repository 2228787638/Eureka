package com.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTestController {
    @GetMapping("testRest")
    public String testRest() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://www.baidu.com", String.class);
    }
}
