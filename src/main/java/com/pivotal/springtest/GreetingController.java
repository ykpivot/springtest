package com.pivotal.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/greetings")
    public @ResponseBody String greeting() {
    	System.out.println("Hmmmm");
        return "Hello World";
    }

}