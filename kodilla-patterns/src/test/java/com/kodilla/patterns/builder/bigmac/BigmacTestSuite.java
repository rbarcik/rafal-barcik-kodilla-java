package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BicmacBuilder()
                .bun("Bun with sesame")
                .burgers(3)
                .sauce("standard")
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("pieczarki")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
