package com.company;

public class AbstractFactoryRectangle {

    public static Rectangle create(int a, int b){
        if (a ==b ) {return
                new Quadrat(0,a);
        } else return new Rectangle(a,b);

    }
}
