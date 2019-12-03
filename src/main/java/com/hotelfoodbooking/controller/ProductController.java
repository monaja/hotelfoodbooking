package com.hotelfoodbooking.controller;

import com.hotelfoodbooking.entities.Products;
import com.hotelfoodbooking.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ServiceClass serviceClass;

    @GetMapping("products")
    public String getProducts(Model model){
        List<Products> products = new ArrayList<>();
                products = serviceClass.getAllProducts();
        model.addAttribute("products", products);
        return "product";
    }

    @GetMapping("addProducts")
    public String addProduct(Products products, Model model)
    {
        model.addAttribute("products",products);
        return "addproduct";
    }

    @GetMapping("deleteproduct/{id}")
    public String deleteproduct(@PathVariable Long id)
    {
        serviceClass.deleteProduct(id);
        return "redirect:/products";
    }

    @PostMapping("addProducts")
    public String processingProduct(Products products)
    {

        if(products != null){
            System.out.println(products.toString());
            serviceClass.addProduct(products);
        }
        return "redirect:products";
    }

}
