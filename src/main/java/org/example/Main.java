package org.example;

import creationalPattern.factoryPattern.Shape;
import creationalPattern.factoryPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShapeInstance("Rectangle");
        rectangle.computeArea();
    }
}