package org.example.webprocjet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/")
    public String product(){
        return "products";    // Название теле документа.
    }
}
