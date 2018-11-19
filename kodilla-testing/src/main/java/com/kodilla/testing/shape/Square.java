package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double dimA;

    public Square(String name, double dimA) {
        this.name = name;
        this.dimA = dimA;
    }
    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        double fieldS = Math.pow(this.dimA,2);
        fieldS = Math.round(fieldS*100);
        fieldS = fieldS / 100;
        return fieldS;
    }
    public String toString(){
        return getShapeName() + " field: " + getField();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.dimA, dimA) != 0) return false;
        return name.equals(square.name);
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
