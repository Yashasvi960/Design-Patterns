package org.example;

import org.example.factoryPattern.Shape;
import org.example.factoryPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShapeInstance("Rectangle");
        rectangle.computeArea();
    }
}