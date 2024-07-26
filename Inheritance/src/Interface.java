public class Interface {
    interface GeometricShape{
        double getArea();
    }
    class Circle implements GeometricShape{
        private double radius;
        public Circle(double radius){
            this.radius=radius;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    class Rectangle implements GeometricShape{
        private double length;
        private double breadth;
        public Rectangle (double length,double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        @Override
        public double getArea(){
            return length*breadth;
        }
    }
    class Triangle implements GeometricShape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }


}
