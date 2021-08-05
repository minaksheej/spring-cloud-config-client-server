package io.poc.springcloudconfig.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Value("${welcome.message}")
    private String welcomeMsg;

   @GetMapping("/welcome")
    public String home() {
        return "Hello ! "+ welcomeMsg;
    }

}
