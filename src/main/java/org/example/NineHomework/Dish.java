package org.example.NineHomework;

import java.util.Map;

public class Dish {
    private String name;
    private Map<String, Integer> recipe;

    public Dish(String name, Map<String, Integer> recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public void cook(Inventory inventory) {
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            String ingredient = entry.getKey();
            int quantity = entry.getValue();
            inventory.useIngredient(ingredient, quantity);
        }
        System.out.println("The dish \"" + name + "\" has been cooked.");
    }
}
