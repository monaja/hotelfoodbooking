package com.hotelfoodbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {
    @GetMapping("shopping_carts")
    public String getShoppingCart(){
        return "shopping_cart";
    }
}
