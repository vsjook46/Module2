package com.company;

public class TriangleFactory {

    public static Triangle create(int a, int b, int c){

        if (a +b > c) {
            return new Triangle(a, b, c);
        } else{
            return null;
        }

    }
}
