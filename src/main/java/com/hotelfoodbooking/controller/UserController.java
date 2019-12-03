package com.hotelfoodbooking.controller;

import com.hotelfoodbooking.entities.Users;
import com.hotelfoodbooking.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    ServiceClass serviceClass;
    @GetMapping("users")
    public String getUsers(Model model){
        List<Users> users = new ArrayList<>();
        users = serviceClass.getAllUsers();
        model.addAttribute("users", users);

        return "user";
    }



    @GetMapping("deleteusers/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        serviceClass.deleteUsers(id);
        return "redirect:/users";
    }
    @GetMapping("editusers/{id}")
    public String editUser(@PathVariable("id") Long id){
        serviceClass.deleteUsers(id);
        return "redirect:/";
    }
}
