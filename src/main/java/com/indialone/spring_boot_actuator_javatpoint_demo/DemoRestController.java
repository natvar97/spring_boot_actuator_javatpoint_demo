package com.indialone.spring_boot_actuator_javatpoint_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/hello")
    public String helloUser() {
        return "Hello User!!";
    }

}
