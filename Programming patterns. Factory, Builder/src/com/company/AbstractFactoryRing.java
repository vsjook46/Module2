/*
 *
 * Classname AbstractFactoryRing
 *
 *  14 June 2020
 *
 * Copyright Holovey Ivan
 *
 * Module 2 task 4.2
 *
 * Programming patterns. Factory, Builder
 *
 * 2. Abstract Factory
 *
 * */
package com.company;

public class AbstractFactoryRing {

        public static Ring create(int a, int b){
            if (a == b) {return
                    new Circle(a);
            } else return new Ring(a,b);
        }
    }

