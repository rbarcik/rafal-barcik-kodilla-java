package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private static ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShape() {
        return shapes;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapes.equals(that.shapes);
    }
    @Override
    public int hashCode() {
        return shapes.hashCode();
    }
    public static void addFigure(Shape shape){
        //do nithing
    }
    public static boolean removeFigure(Shape shape){
        //temporarily return true
        return true;
    }
    public static Shape getFigure(int n){
        //temporarily return false
        return null;
    }
    public static ArrayList<Shape> showFigures(){
        //temporarily return false
        return shapes;
    }
    public static int getShapeQuantity(){
        // return 100 temporarily
        return 100;
    }
}
