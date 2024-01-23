package com.andt.chuctetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/wish")
    String toWishPage() {
        return "wish";
    }
}
