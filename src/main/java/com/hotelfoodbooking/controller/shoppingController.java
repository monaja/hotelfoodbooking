package com.hotelfoodbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shoppingController {
    @GetMapping("shoppings")
    public String getShopping(){
        return "shopping";
    }
}
