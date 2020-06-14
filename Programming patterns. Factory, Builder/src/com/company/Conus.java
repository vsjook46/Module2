package com.company;

public class Conus implements IGeometry {
    private int radius;
    private int height;

    public Conus() {
    }

    public Conus(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Conus{" +
                "radius=" + radius +
                ", height=" + height +
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
