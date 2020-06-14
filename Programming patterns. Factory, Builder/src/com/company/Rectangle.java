package com.company;


public class Rectangle implements IGeometry {

    private int id;
    private int length;
    private int width;
    public final double PI = 3.14;

    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }



    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    //  POJO  plane old java object

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int  getArea(int length, int width){
        return length * width;
    }

    public boolean isQuadrat(){
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + id +
                ", length=" + length +
                ", width=" + width +
                ", PI=" + PI +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getLinearLength() {
        return 0;
    }
}
