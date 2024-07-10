package com.stevenjohnson.tacocloud.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/current")
    public String orderForm() {
        return "order";
    }
}
