package creational.factory;

import creational.factory.impl.Circle;
import creational.factory.impl.Rectangle;
import creational.factory.impl.Square;
import creational.factory.service.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
