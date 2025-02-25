package com.consdata.example.demogithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/test")
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);
    private static String AAA = "werwer";

    @GetMapping
    public String hello() {
        logger.info("test");
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("world2");
        logger.info(list);
        return "OK";
    }
}
