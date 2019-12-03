package com.hotelfoodbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShippingController {
    @GetMapping("shippings")
    public String getShipping(){
        return "shipping";
    }
}
