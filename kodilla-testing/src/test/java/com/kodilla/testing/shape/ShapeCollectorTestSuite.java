package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static com.kodilla.testing.shape.ShapeCollector.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        Shape square = new Square("Square", 8.0);
        Shape triangle = new Triangle("Triangle", 9.0);
        Shape circle = new Circle("Circle", 10.0);
        //When
        addFigure(square);
        addFigure(triangle);
        addFigure(circle);
        //Then
        Assert.assertEquals(3, getShapeQuantity());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape square = new Square("Square", 8.0);
        Shape triangle = new Triangle("Triangle", 9.0);
        Shape circle = new Circle("Circle", 10.0);
        addFigure(square);
        addFigure(triangle);
        addFigure(circle);
        //When
        boolean result = removeFigure(square) && removeFigure(triangle) && removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, getShapeQuantity());
    }
    @Test
    public void testGetFigure(){
        //Given
        Shape square = new Square("Square", 8.0);
        Shape triangle = new Triangle("Triangle", 9.0);
        Shape circle = new Circle("Circle", 10.0);
        addFigure(square);
        addFigure(triangle);
        addFigure(circle);
        //When
        Shape retrievedShape0 = getFigure(0);
        Shape retrievedShape1 = getFigure(1);
        Shape retrievedShape2 = getFigure(2);
        //Then
        Assert.assertEquals(square, retrievedShape0);
        Assert.assertEquals(triangle, retrievedShape1);
        Assert.assertEquals(circle, retrievedShape2);
    }
    @Test
    public void testShowFigures(){
        //Given
        Shape square = new Square("Square", 8.0);
        Shape triangle = new Triangle("Triangle", 9.0);
        Shape circle = new Circle("Circle", 10.0);
        addFigure(square);
        addFigure(triangle);
        addFigure(circle);
        //When
        ArrayList<Shape> testShapes = new ArrayList<Shape>();
        testShapes.add(square);
        testShapes.add(triangle);
        testShapes.add(circle);
        ArrayList<Shape> retrievedShapes = new ArrayList<Shape>(showFigures());
        //Then
        Assert.assertEquals(testShapes, retrievedShapes);
    }
}
