package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin!");
    }
    @After
    public void after(){
        System.out.println("Test Case: end!");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin!");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End!");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(new Integer(1));
        numbers.add(new Integer(2));
        numbers.add(new Integer(3));
        numbers.add(new Integer(4));
        ArrayList<Integer> testedNumbersList = new ArrayList<Integer>();
        testedNumbersList.add(new Integer(2));
        testedNumbersList.add(new Integer(4));
        //When
        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>(OddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing " + evenNumbersList);
        //Then
        Assert.assertEquals(evenNumbersList, testedNumbersList);
        System.out.println("evenNumbersList: " + evenNumbersList + " " + "testedNumbers: " + testedNumbersList);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> testedNumbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>(OddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing " + evenNumbersList);
        //Then
        Assert.assertEquals(evenNumbersList, testedNumbers);
        System.out.println("Empty evenNumbersList: " + evenNumbersList + " " + "Empty testedNumbers: " + testedNumbers);
    }
}
