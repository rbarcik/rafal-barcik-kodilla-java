package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final Integer burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BicmacBuilder {
        private String bun;
        private Integer burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BicmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BicmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BicmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BicmacBuilder ingredient(String ingredient) {
            if(AllowedIngredients.getAllowedIngredients().contains(ingredient)){
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Bad ingredient " + "[" + ingredient + "]" + "\n" +
                        "You can choose : " + AllowedIngredients.getAllowedIngredients());
            }
            return this;
        }

        public Bigmac build() {
            if(bun == null) {
                throw new IllegalStateException("Bicmac cannot be without bun");
            } else {
                if(!(bun.equals("Bun with sesame") || bun.equals("Bun without sezame"))){
                    throw new IllegalStateException("You can chose: Bun with sesame  or Bun without sezame");
                }
            }
            if(burgers < 1 || burgers > 3) {
                throw new IllegalStateException("Burgers number can be 1 - 3 .");
            }
            if(!(sauce == null || sauce.equals("standard") || sauce.equals("1000 wysp") || sauce.equals("barbecue"))) {
                throw new IllegalStateException("Sauce can be: (standard, 1000 wysp or barbecue");
            }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final Integer burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
