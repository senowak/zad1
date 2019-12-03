package com.zad1.zad1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/naZmiane/{String}")
    public Model greeting(@PathVariable String String) {
        Model response = new Model();
        response.revString = new StringBuilder(String).reverse().toString();
        return response;
    }
}
