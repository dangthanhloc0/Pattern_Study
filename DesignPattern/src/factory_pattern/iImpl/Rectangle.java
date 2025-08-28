package factory_pattern.iImpl;

import factory_pattern.interfaceEx.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
