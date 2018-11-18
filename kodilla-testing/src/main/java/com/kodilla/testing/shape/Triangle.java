package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double field;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        return this.field;
    }
    public String toString(){
        return getShapeName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.field, field) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

