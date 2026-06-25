package com.example.employee_management_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Employee API is running successfully - by Divyansh Yadav";
    }
    
}