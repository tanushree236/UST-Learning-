public class ShapeMain {
    public static void main(String[] args) {
        Shape s=new Shape();
        Shape s1=new Shape (12,"Shape");
        Shape s2=new Shape(12,11,"Shape2");

        Shape.xyz s3=s.new xyz();
        s3.display();
    }
}
