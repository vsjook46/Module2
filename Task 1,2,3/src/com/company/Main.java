/*
 * Classname Main
 * Version 1
 *
 * Copyright Ivan HOLOVEY
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        // Doing work with our ring
        Ring ring = new Ring(5, 10);

        System.out.println(ring);
        System.out.println(ring.hashCode());
        //***************************************

        // Doing with class Panel
        Panel myWall = new Panel("white",
                "bricks",
                true,
                7,
                5,
                false,
                1);

        //***************************************

        // Doing with class SmallRing
        SmallRing eSmallRing = new SmallRing(4, 8, 3);
        System.out.println(eSmallRing);
        //***************************************
    }
}
