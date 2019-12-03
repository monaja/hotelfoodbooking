package com.hotelfoodbooking.controller;

import com.hotelfoodbooking.entities.Users;
import com.hotelfoodbooking.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class signup {
    @Autowired
    ServiceClass serviceClass;

    @GetMapping("sign_up")
    public String signUp(Users users, Model model){
        model.addAttribute("users", users);
        return "signup";
    }

    @PostMapping("add_user")
    public String addUser(Users users){

        System.out.println(users.toString());
        serviceClass.addUsers(users);

        return "redirect:/users";
    }

    @GetMapping("add_sign_up")
    public String processingsignUp(Users users){
        if(users != null){
            serviceClass.addUsers(users);
        }
         return "redirect:/users";
    }
}
