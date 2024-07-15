package com.stevenjohnson.tacocloud.controllers;

import com.stevenjohnson.tacocloud.domain.TacoOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/current")
    public String orderForm() {
        return "order";
    }

    @PostMapping()
    public String processOrder(TacoOrder order, SessionStatus sessionStatus) {
        logger.info("Order was submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
