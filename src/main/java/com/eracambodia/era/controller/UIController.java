package com.eracambodia.era.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import springfox.documentation.annotations.ApiIgnore;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@ApiIgnore
@Controller
public class UIController {
    @GetMapping({"/", "/index","/api"})
    public String starter() {
        return "redirect:/swagger-ui.html";
    }
}
