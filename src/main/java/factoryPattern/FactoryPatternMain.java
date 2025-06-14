package factoryPattern;

public class FactoryPatternMain {
        public static void main(String[] args) {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape rectangle = shapeFactory.getShapeInstance("Rectangle");
            rectangle.computeArea();
        }
}
