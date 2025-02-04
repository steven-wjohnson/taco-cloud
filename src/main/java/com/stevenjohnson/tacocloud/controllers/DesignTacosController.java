package com.stevenjohnson.tacocloud.controllers;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.stevenjohnson.tacocloud.domain.Ingredient;
import com.stevenjohnson.tacocloud.domain.Taco;
import com.stevenjohnson.tacocloud.domain.TacoOrder;
import com.stevenjohnson.tacocloud.domain.Ingredient.Type;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacosController {

    private static final Logger logger = LoggerFactory.getLogger(DesignTacosController.class);
    
    @ModelAttribute
    public void addIngredientsToModel(Model model){
        List<Ingredient> ingredients = List.of(
            new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
            new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
            new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
            new Ingredient("CARN", "Carnitas", Type.PROTEIN),
            new Ingredient("CHKN", "Chicken", Type.PROTEIN),
            new Ingredient("STEK", "Steak", Type.PROTEIN),
            new Ingredient("SRMP", "Shrimp", Type.PROTEIN),
            new Ingredient("TMTO", "Diced Tomatos", Type.VEGGIES),
            new Ingredient("LETC", "Lettuce", Type.VEGGIES),
            new Ingredient("OLIV", "Black Olive", Type.VEGGIES),
            new Ingredient("CORN", "Corn", Type.VEGGIES),
            new Ingredient("ONIO", "Onion", Type.VEGGIES),
            new Ingredient("AVAC", "Avacado", Type.VEGGIES),
            new Ingredient("JALA", "Jalapeno Pepper", Type.VEGGIES),
            new Ingredient("CHED", "Cheddar", Type.CHEESE),
            new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
            new Ingredient("QUES", "Mexican Queso", Type.CHEESE),
            new Ingredient("SLSA", "Salsa", Type.SAUCE),
            new Ingredient("SRCR", "Sour Cream", Type.SAUCE),
            new Ingredient("GUAC", "Guacamole", Type.SAUCE),
            new Ingredient("HOTS", "Hot Sauce", Type.SAUCE)
        );

        Type[] types = Type.values();
        for (Type type : types){
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    } 

    private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
        .stream()
        .filter(x -> x.getType().equals(type))
        .collect(Collectors.toList());
    }

    @ModelAttribute(name="tacoOrder")
    public TacoOrder tacoOrder() {
        return new TacoOrder();
    }

    @ModelAttribute(name="taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping
    public String showDesignForm() {
        return "design";
    }

    @PostMapping
    public String processTaco(@Valid Taco taco, Errors errors, @ModelAttribute TacoOrder tacoOrder) {
        if(errors.hasErrors()) {
            return "design";
        }
        tacoOrder.addTaco(taco);
        logger.info("Added taco to order: {}", taco);
        return "redirect:/orders/current";
    }
    
}