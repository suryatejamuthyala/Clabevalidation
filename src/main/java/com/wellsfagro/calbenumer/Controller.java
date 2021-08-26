package com.wellsfagro.calbenumer;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "none");
        return "index.html";
    }

}
