/*
 *
 * Classame SmallRing
 *
 *  06 June 2020
 *
 * Copyright Holovey Ivan
 *
 *  Module 2 task 2.2.
 *
 *  Inheritance
 * 2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 *
 *
 */
package com.company;

public class SmallRing extends Ring{

    // Creating another radius that is within our Ring but smaller than Inner radius
    double smallR;

    // Constructor
    public SmallRing( double r, double R, double smallR) {
        super(r, R);
        this.smallR = smallR;
    }
    //***************************************

    // Getter and Setter
    public double getSmallR() {
        return smallR;
    }

    public void setSmallR(double smallR) {
        this.smallR = smallR;
    }
    //***************************************

    // toString()
    @Override
    public String toString() {
        return "SmallRing{" +
                "smallR=" + smallR +
                '}';
    }
}
