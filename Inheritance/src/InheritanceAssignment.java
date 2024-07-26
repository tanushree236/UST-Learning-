import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

interface GeometricShape {
    double getArea();
}

class Circle1 implements GeometricShape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 implements GeometricShape {
    private double length;
    private double breadth;

    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}

class Triangle1 implements GeometricShape {
    private double base;
    private double height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Square1 extends Rectangle1 {
    public Square1(double side) {
        super(side, side);
    }
}

public class InheritanceAssignment {
    public static void main(String[] args) {
        List<GeometricShape> shapes = new ArrayList<>();
        shapes.add(new Circle1(5));
        shapes.add(new Rectangle1(4, 5));
        shapes.add(new Triangle1(6, 8));
        shapes.add(new Square1(3));

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    public static double calculateTotalArea(List<GeometricShape> shapes) {
        double totalArea = 0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
