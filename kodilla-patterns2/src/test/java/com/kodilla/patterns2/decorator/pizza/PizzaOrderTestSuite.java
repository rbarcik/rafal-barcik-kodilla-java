package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculateCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("pizza cake and tomato sauce with cheese", description);
    }
    @Test
    public void testPizzaWithHamGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamAdditionDecorator(thePizza);
        //When
        BigDecimal calculateCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculateCost);
    }
    @Test
    public void testPizzaWithHamGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamAdditionDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("pizza cake and tomato sauce with cheese + ham", description);
    }
    @Test
    public void testPizzaWithHamAndCheeseGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamAdditionDecorator(thePizza);
        thePizza = new CheeseAdditionDecorator(thePizza);
        //When
        BigDecimal calculateCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20.00), calculateCost);
    }
    @Test
    public void testPizzaWithHamAndCheeseGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamAdditionDecorator(thePizza);
        thePizza = new CheeseAdditionDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("pizza cake and tomato sauce with cheese + ham + cheese", description);
    }
}
