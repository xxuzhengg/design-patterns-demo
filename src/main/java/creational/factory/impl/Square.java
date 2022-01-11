package creational.factory.impl;

import creational.factory.service.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }

}
