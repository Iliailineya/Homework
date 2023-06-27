package org.example.NineHomework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Recipes recipes = new Recipes();
        recipes.doBorsch();
        recipes.doSchnitzel();

        for (String key : Recipes.inventory.getINGREDIENTS().keySet()) {
            System.out.println("Key: " + key + ", Value: " + Recipes.inventory.getINGREDIENTS().get(key));
        }
    }
}
