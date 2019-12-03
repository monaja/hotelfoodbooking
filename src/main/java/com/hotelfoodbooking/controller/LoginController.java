package com.hotelfoodbooking.controller;

import com.hotelfoodbooking.entities.Users;
import com.hotelfoodbooking.service.ServiceClass;
import com.hotelfoodbooking.service.ServiceImplementation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    ServiceClass serviceClass;



    @GetMapping("")
    public String blankHome(){
        return "home";
    }

    @GetMapping("home")
    public String home(){
        return "home";
    }

    @GetMapping("login")
    public String login(Users user, Model model){
         model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("login")
    public String processLogin(Users user){
        System.out.println(user.toString());
        if(user.getEmail()!= null) {
            Users userD = serviceClass.getUser(user.getEmail());
            String str = user.getPassword();
            String str1 = userD.getPassword();
            String email1 = user.getEmail();
            String email2 = userD.getEmail();
            if(str == str1){
                System.out.println("returning home");
                return "home";
            }
        }
        return "login";
    }
}
