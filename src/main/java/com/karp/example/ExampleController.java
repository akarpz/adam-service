package com.karp.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping(path = "/api/v1/thing", method = RequestMethod.GET)
    public boolean thing() {
        return true;
    }

}
