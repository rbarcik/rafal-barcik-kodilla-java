package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double dimA;

    public Triangle(String name, double dimA) {
        this.name = name;
        this.dimA = dimA;
    }

    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        double fieldT =  (Math.pow(this.dimA, 2)*Math.sqrt(3))/4;
        fieldT = Math.round(fieldT*100);
        fieldT = fieldT / 100;
        return fieldT;
    }
    public String toString(){
        return getShapeName() + " field: " + getField();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.dimA, dimA) != 0) return false;
        return name.equals(triangle.name);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(dimA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

