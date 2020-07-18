package com.javtechie.springbootformvalidation.api.controller;

import com.javtechie.springbootformvalidation.api.dto.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@Controller
public class PersonController
{

    @GetMapping("/")
    public String showForm(Person person)
    {
        return "register";
    }

    @PostMapping("/")
    public String register(@Valid Person person, Errors error, Model model)
    {
        if(error.hasErrors())
        {
            return "register";
        }
        else
        {
            model.addAttribute("message", "Registration successfully");
            return "register";
        }
    }
}
