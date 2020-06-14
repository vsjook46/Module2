package com.company;

public class RectangleFactory {

    public static Rectangle create(int id, int length, int width){

        Rectangle rectangle = new Rectangle(id, length, width);

        return rectangle;
    }


}
