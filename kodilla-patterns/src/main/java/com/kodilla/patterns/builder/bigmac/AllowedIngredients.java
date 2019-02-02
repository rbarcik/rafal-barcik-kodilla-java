package com.kodilla.patterns.builder.bigmac;

import java.util.LinkedList;
import java.util.List;

public class AllowedIngredients {

    public static List<String> getAllowedIngredients() {
        List<String> allowedIngredients = new LinkedList<>();
        allowedIngredients.add("sałata");
        allowedIngredients.add("cebula");
        allowedIngredients.add("bekon");
        allowedIngredients.add("ogórek");
        allowedIngredients.add("papryczki chilli");
        allowedIngredients.add("pieczarki");
        allowedIngredients.add("krewetki");
        allowedIngredients.add("ser");
        return allowedIngredients;
    }
}
