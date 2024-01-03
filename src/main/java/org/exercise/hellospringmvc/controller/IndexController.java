package org.exercise.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public String index(@RequestParam(name = "dice", defaultValue = "6", required = false) int dice, Model model) {
        // GENERA NUMERO CASUALE
        Random random = new Random();
        int randomNumber = random.nextInt(dice) + 1;

        // AGGIUNGO ATTRIBUTO
        model.addAttribute("number", randomNumber);
        return "home";
    }
}




