package creational.factory.impl;

import creational.factory.service.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }

}

