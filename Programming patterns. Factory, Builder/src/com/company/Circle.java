package com.company;

public class Circle extends Ring{

    public Circle (int R) {
        super(R);
    }

    public double getArea () {
        return Math.PI * Math.pow(this.getR(), 2);
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}
