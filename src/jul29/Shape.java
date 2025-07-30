package jul29;

import java.util.List;

public class Shape {

    public double getArea(){
        return 0.0;
    }
}
class Circle extends Shape{
    // pi * r * r
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        System.out.println("Area of a cirlce : "+shape.getArea());

        Shape shape2 = new Square(10);
        System.out.println("Area of square : "+shape2.getArea());
    }
}