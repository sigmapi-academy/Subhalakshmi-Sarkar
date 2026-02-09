package com.librarymanagement.librarymanagement;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloSpringController {
    @RequestMapping("/Hello")
    public String helloSpring() {
        return "Awesome! Welcome to spring boot";
    }
}
