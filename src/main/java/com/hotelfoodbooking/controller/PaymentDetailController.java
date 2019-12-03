package com.hotelfoodbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentDetailController {
    @GetMapping("payment_details")
    public String getPaymentDetails(){
        return "payment_detail";
    }
}
