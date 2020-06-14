/*
 *
 * Classname RingFactory
 *
 *  14 June 2020
 *
 * Copyright Holovey Ivan
 *
 * Module 2 task 4.1
 *
 * Programming patterns. Factory, Builder
 *
 * 1. Factory
 *
 * */
package com.company;

public class RingFactory {

    public static Ring create(int r, int R) {

        if (r != r && R != R) {
            return new Ring(r, R);
        } else {
            return null;
        }
    }
}