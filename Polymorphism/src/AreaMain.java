public class AreaMain {
    public static void main(String[] args) {
        Area a=new Area();
        double area=a.calculateArea(12.5);
        System.out.println(area);
        int area1=a.calculateArea(12);
        System.out.println(area1);
        System.out.println(a.calculateArea(5.3,4.3));
        System.out.println(a.calculateArea("Hello",5.3,4.3));
        System.out.println(a.calculateArea(5.3,4.3,"Hello"));


    }
}
