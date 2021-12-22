package com.example.recepie.recepieapp.controller;

import com.example.recepie.recepieapp.service.RecepieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private final RecepieService recepieService;

    public IndexController(RecepieService recepieService) {
        this.recepieService = recepieService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recepieService.getRecipes());

        return "index";
    }
}
