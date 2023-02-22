package com.example.propratest.Controller;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String getNames(Model model, @RequestParam(name = "name", required = false) String name) {
        model.addAttribute("name", name);
        System.out.println(name);
        System.out.println(model.getAttribute("name"));
        return "index";
    }

    @PostMapping("/index")
    public String setNames(Model model) {
        return "index";
    }
}
