package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @GetMapping("/address")
    public String GetEndereco(){
        return "hello world";
    }
}
