package com.themanawaha.opentracing_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/docker")
    public String docker() {
        return "Hello Docker!";
    }

    @RequestMapping("/spring")
    public String spring() {
        return "Hello Spring!";
    }

    @RequestMapping("/")
    public String index() {
        return "Welcome to this little demo application. Feel free to try the other pages.";
    }

}
