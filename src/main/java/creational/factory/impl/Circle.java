package creational.factory.impl;

import creational.factory.service.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }

}
