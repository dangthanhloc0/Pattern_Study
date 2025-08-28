package factory_pattern.iImpl;

import factory_pattern.interfaceEx.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}



