package ru.alexander.rfinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RFinderController {


    @RequestMapping("/find")
    public String getMethod(String param){
return "blla";
    }
}
