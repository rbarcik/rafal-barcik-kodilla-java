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
        shapes.add(shape);
    }
    public static boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public static Shape getFigure(int n){
        Shape theShape = null;
        if(n >= 0 && n < shapes.size()){
            theShape = shapes.get(n);
        }
        return theShape;
    }
    public static ArrayList<Shape> showFigures(){
        return shapes;
    }
    public static int getShapeQuantity(){
        return shapes.size();
    }
}
