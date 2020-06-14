package com.company;

public class Quadrat extends Rectangle {
    public Quadrat(int id, int length) {
        super(id, length, length);
    }

    @Override
    public String toString() {
        return "Quadrat{}";
    }
}
