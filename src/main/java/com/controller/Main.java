package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String userPage() {
        return "content/user";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminPage() {
        return "content/admin";
    }

    @RequestMapping(value = {"", "login-check"}, method = RequestMethod.GET)
    public ModelAndView loginCheck(@RequestParam(value = "error",required = false) String error) {
        ModelAndView modelAndView = new ModelAndView();
        if(error!=null){
            modelAndView.addObject("error","Invalid username or password");
        }
        modelAndView.setViewName("login-check");
        return modelAndView;
    }
}
