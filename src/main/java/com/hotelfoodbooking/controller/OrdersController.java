package com.hotelfoodbooking.controller;

import com.hotelfoodbooking.entities.Orders;
import com.hotelfoodbooking.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    ServiceClass serviceClass;
    @GetMapping("orders")
    public String getOrders(Model model ){
        List<Orders> orders = new ArrayList<>();
        orders = serviceClass.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @GetMapping("deleteorders/{id}")
    public String deleteOrders(@PathVariable("id") Long id){
        serviceClass.deleteOrders(id);
        return "redirect:/orders";
    }


}
