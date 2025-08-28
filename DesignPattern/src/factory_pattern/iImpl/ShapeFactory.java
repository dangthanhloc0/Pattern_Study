package factory_pattern.iImpl;

import factory_pattern.interfaceEx.Shape;

public class ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }
}

