package com.groupe.assignments.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String mandehaNyTest(){
        return "Teest";
    }
}
