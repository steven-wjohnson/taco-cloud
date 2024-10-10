package com.stevenjohnson.tacocloud;

import com.stevenjohnson.tacocloud.domain.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO",
            new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
        ingredientMap.put("COTO",
            new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
        ingredientMap.put("GRBF",
                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
        ingredientMap.put("CARN",
                new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
        ingredientMap.put("CHKN",
                new Ingredient("CHKN", "Chicken", Ingredient.Type.PROTEIN));
        ingredientMap.put("STEK",
                new Ingredient("STEK", "Steak", Ingredient.Type.PROTEIN));
        ingredientMap.put("SRMP",
                new Ingredient("SRMP", "Shrimp", Ingredient.Type.PROTEIN));
        ingredientMap.put("TMTO",
                new Ingredient("TMTO", "Diced Tomatos", Ingredient.Type.VEGGIES));
        ingredientMap.put("LETC",
                new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
        ingredientMap.put("OLIV",
                new Ingredient("OLIV", "Black Olive", Ingredient.Type.VEGGIES));
        ingredientMap.put("CORN",
                new Ingredient("CORN", "Corn", Ingredient.Type.VEGGIES));
        ingredientMap.put("ONIO",
                new Ingredient("ONIO", "Onion", Ingredient.Type.VEGGIES));
        ingredientMap.put("AVAC",
                new Ingredient("AVAC", "Avacado", Ingredient.Type.VEGGIES));
        ingredientMap.put("JALA",
                new Ingredient("JALA", "Jalapeno Pepper", Ingredient.Type.VEGGIES));
        ingredientMap.put("CHED",
                new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
        ingredientMap.put("JACK",
                new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
        ingredientMap.put("QUES",
                new Ingredient("QUES", "Mexican Queso", Ingredient.Type.CHEESE));
        ingredientMap.put("SLSA",
                new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
        ingredientMap.put("SRCR",
                new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
        ingredientMap.put("GUAC",
                new Ingredient("GUAC", "Guacamole", Ingredient.Type.SAUCE));
        ingredientMap.put("HOTS",
                new Ingredient("HOTS", "Hot Sauce", Ingredient.Type.SAUCE));
    }
    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
