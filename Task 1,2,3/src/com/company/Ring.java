/*
*
* Classame Ring
*
*  06 June 2020
*
* Copyright Holovey Ivan
*
*  Module 2 task 1
*
* Create a class from the attached document according to the order in your group .  The class must contain
* 1. Constructor.
* 2. Getters/Setters.
* 3. Create 5 methods.
* 4. Override toString() method
* 5. Override hash() and equals() methods.
*
*/
package com.company;

import java.util.Objects;

public class Ring implements IGeometry, IPackaging {

    // Creating variables of p.t. 'double' for Ring
    private double r;
    private double R;
    //***************************************

    // Creating empty Constructor
    public Ring() {
    }
    //***************************************

    // Task 1.1. Creating  Constructor
    public Ring(double r, double R) {
        this.r = r;
        this.R = R;
    }
    //***************************************

    // Task 1.2. Creating Getters/Setters
    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double getr() {
        return r;
    }

    public void setr(double r) {
        this.r = r;
    }
    //***************************************

    // Task 1.3. Creating 5 methods of Ring
    // 1)
    public double getArea () {
        return Math.PI * Math.pow(this.getR(), 2)
                - Math.PI * Math.pow(this.getr(), 2);
    }

    // 2)
    public double getOuterLength () {
        return 2 * Math.PI * this.getR();
    }

    // 3)
    public double getInnerLength () {
        return 2 * Math.PI * this.getr();
    }

    // 4)
    public double getDiameter () {
        return this.getR() * 2;
    }

    // 5)
    public boolean isRtwiceBig(){
        return (this.getr() == 0.5 * this.getR()) ? true : false;
    }
    //***************************************

    // Task 1.4. Overriding toString() method
    @Override
    public String toString() {
        return "Ring{" +
                "Inner radius (r) =" + r +
                ", Outher radius (R) =" + R +
                ", Inner length=" + this.getInnerLength() +
                ", Inner length=" + this.getOuterLength() +
                ", Diameter=" + this.getDiameter() +
                ", Inner radius equals Outher radius" + this.isRtwiceBig() +
                 '}';
    }
    //***************************************

    // Task 1.5. Overriding hash() and equals() methods
    // equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ring ring = (Ring) o;
        return Double.compare(ring.r, r) == 0 &&
                Double.compare(ring.R, R) == 0;
    }

    // hash()
    @Override
    public int hashCode() {
        return Objects.hash(r, R);
    }
    //***************************************


    // Task 3. Interfaces - toJSON (), toXML(), toConsole()
    @Override
    public double getLinearLength() {
        return Math.PI * this.getDiameter();
    }

    public String toJSON () {
        String json = "Ring ("
                + "\""  + "Outer radius\":" + this.getR() + ";"
                + "\""  + "inner radius\":" + this.getr()
                + ")";
        return json;
    }

    public String toXML() {
        String xml = "<Ring>"
                + "<Outer radius>" + this.getR() + "</Outer radius>"
                + "<Inner radius>" + this.getr() + "</Inner radius>"
                +  "</Ring>";

        return xml;
    }
    public String toConsole() {
        return "Ring: "
                + "1. Inner radius is " + r
                +"Outer radius is " + R
                +"Area is " + this.getArea()
                + "The length of inner circle is "
                + this.getInnerLength()
                + "The length of outer circle is " + this.getOuterLength();
    }
    //***************************************

}
