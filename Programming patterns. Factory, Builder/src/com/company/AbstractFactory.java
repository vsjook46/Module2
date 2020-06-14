package com.company;

public class AbstractFactory {

    public static IGeometry create(int a, int b, Figure figure){

/*
        if (type.equals(Figure.TRIANGLE)) return new Triangle(a,b);
        if (type.equals(Figure.RECTANGLE)) return new Rectangle(a,b);
        if (type.equals(Figure.CONUS)) return new Conus(a,b);
        if (type.equals(Figure.RING)) return new Ring(a,b);

        return  null;
*/

          switch (figure) {

              case TRIANGLE: return new Triangle(a,b);
              case RECTANGLE: return new Rectangle(a,b);
              case CONUS: return new Conus(a,b);
              case RING: return new Ring(a,b);
              default: return null;
          }





    }
}
