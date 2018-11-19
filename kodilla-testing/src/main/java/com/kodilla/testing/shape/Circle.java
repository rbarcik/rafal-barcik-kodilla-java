package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        double fieldC = Math.pow(this.radius,2) * 3.14;
        fieldC = Math.round(fieldC*100);
        fieldC = fieldC / 100;
        return fieldC;
    }
    public String toString(){
        return getShapeName() + " field: " + getField();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return name.equals(circle.name);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}