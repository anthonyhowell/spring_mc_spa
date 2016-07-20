package com.example.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {


    /**
     * Catch all routes not prefixed with the API context
     */
    @RequestMapping("/client/**")
    public String test() {
        return "client";
    }


}
